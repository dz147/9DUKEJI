//获得url参数，只接收一个值
function oneValues() {
	var result;
	var url = window.location.search; //获取url中"?"符后的字串  
	if (url.indexOf("?") != -1) {
		result = url.substr(url.indexOf("=") + 1);
	}
	return result;
};


//接受url多参数
function manyValues() {
	var url = window.location.search;
	if (url.indexOf("?") != -1) {
		var str = url.substr(1);
		strs = str.split("&");
		var key = new Array(strs.length);
		var value = new Array(strs.length);
		for (i = 0; i < strs.length; i++) {
			key[i] = strs[i].split("=")[0]
			value[i] = unescape(strs[i].split("=")[1]);
			//alert(key[i]+"="+value[i]);
		}
	}
}

//点击图片进行预览method
function clickImg(src) {
	$('#productlogo').attr('src', src);
	$('#productbig').attr('src', src);
};

//单击改变小图给div加样式
function changepic(imgobj) {
	$(".current").removeClass('current');
	$(imgobj).addClass('current');
}




//请求加载产品预览图
function loadingPic(url) {
	var a = oneValues();
	fetch(url + '/selectPicture/' + a + '', {
			method: "get",
			credentials: 'include',
		}).then(resp => resp.json())
		.then(data => {
			var str = "";
			str += '<div class="pts_pictureShow fl">';
			str += '<div class="small">';
			str += '<img id="productlogo" src="./goodsImages/' + data.data[0].pic_name + '"/>';
			str += '	<div class="mask"></div>';
			str += '</div>';
			str += '<div class="big">';
			str += '	<img id="productbig" src="./goodsImages/' + data.data[0].pic_name + '" />';
			str += '</div>';
			str += '</div>';
			str += '<div class="pts_sel_pic fl">';
			str += '<ul>';
			$(data.data).each(function(i, obj) {
				if (i <= 5) {
					if (i == 0) {
						str +=
							'<li onclick="changepic(this)" class="current"><img src="./goodsImages/' + obj.pic_name +
							'" alt="" onclick="clickImg(this.src)" ></li>';
					} else {
						str +=
							'<li onclick="changepic(this)"><img src="./goodsImages/' + obj.pic_name +
							'" alt="" onclick="clickImg(this.src)" ></li>';
					}
				}
			});

			str += '</ul>';
			str += '</div>';

			$("#picture_view").append(str);
			zoomin();
		});
};

//SKU+规格-规格值

function getSkuAndSpecValue(url) {
	var id = oneValues();
	fetch(url + '/loadingSpec/' + id + '', {
			method: "get",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include'
		}).then(resp => resp.json())
		.then(data => {
			$("#pro_color").text(data.data[0].spec_name + ":");
			$("#pro_ram").text(data.data[1].spec_name + ":");

			if (data.data[0].id != null) {
				fetch(url + '/selectSpecValues/' + data.data[0].id + '', {
						method: "get",
						headers: {
							"Content-Type": "application/json",
							"Accept": "application/json"
						},
						credentials: 'include'
					}).then(resp => resp.json())
					.then(data => {
						let value = "";
						$(data.data).each(function(i, obj) {
							if (i === 0) {
								console.log(i);
								value += '<div class="item seleted sku-color" data-id="' + obj.id + '" onclick="clickColor(this)">';
								value += '<a href="javascript:;">' + obj.spec_value + '';
								value += '</a>';
								value += '</div>';
							} else {
								value += '<div class="item" data-id="' + obj.id + '" onclick="clickColor(this)">';
								value += '<a href="javascript:;">' + obj.spec_value + '';
								value += '</a>';
								value += '</div>';
							}
						});
						$(".pro_color").append(value);
					});
			};
			if (data.data[1].id != null) {
				fetch(url + '/selectSpecValues/' + data.data[1].id + '', {
						method: "get",
						headers: {
							"Content-Type": "application/json",
							"Accept": "application/json"
						},
						credentials: 'include'
					}).then(resp => resp.json())
					.then(data => {
						let value = "";
						$(data.data).each(function(i, obj) {
							if (i === 0) {
								value += '<div class="item ram" data-id="' + obj.id + '" onclick="clickRAM(this)">';
								value += '<a href="javascript:;"><span>64GB</span></a>';
								value += '</div>';
							} else {
								value += '<div class="item" data-id="' + obj.id + '" onclick="clickRAM(this)">';
								value += '<a href="javascript:;"><span>' + obj.spec_value + '</span></a>';
								value += '</div>';
							}
						});
						$(".pro_size").append(value);
						var s = $(".pro_color .sku-color");
						var colorId = "";
						for (var i = 0; i < s.length; i++) {
							colorId = s[i].getAttribute("data-id");
						}
						var s = $(".pro_size .ram");
						var ramId = "";
						for (var i = 0; i < s.length; i++) {
							ramId = s[i].getAttribute("data-id");
						}
						if(colorId === "" && ramId > 0){
							console.log("没查到哦");
							selectBySku(url, id, 1, ramId);
						}else{
							selectBySku(url, id, colorId, ramId);
						}
						console.log("颜色ID：" + colorId + ",内存ID：" + ramId + "，首次加载得到的规格值");
					});
			};

		});
};

// 规格值选择JS
function clickColor(d) {
	//规格class
	$(".sku-color").removeClass('sku-color');
	$(d).addClass('sku-color');

	var colorId = d.getAttribute("data-id");
	var s = $(".pro_size .ram");
	var ramId = "";
	for (var i = 0; i < s.length; i++) {
		ramId = s[i].getAttribute("data-id");
	}
	console.log("颜色ID：" + colorId + ",内存ID：" + ramId);
	var id = oneValues();
	selectBySku(url, id, colorId, ramId);
};

/* 
	点击内存值方法
 */
function clickRAM(d) {
	$(".ram").removeClass('ram');
	$(d).addClass('ram');

	var ram = d.getAttribute("data-id");
	var s = $(".pro_color .sku-color");
	var colorId = "";
	for (var i = 0; i < s.length; i++) {
		colorId = s[i].getAttribute("data-id");
	}
	console.log("颜色ID：" + colorId + ",内存ID：" + ram);
	var id = oneValues();
	selectBySku(url, id, colorId, ram);
};

/** 
 * 查询购物车数量
 */
function getCountByCart(url, uid) {
	if (uid === undefined) {
		alert("用户Id为空")
	}
	fetch(url + '/getCountByCart/' + uid + '', {
			method: "GET",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include'
		}).then(resp => resp.json())
		.then(data => {
			console.log(data)
			$("#cartCount").text("购物车(" + data.data + ")");
		});
};

/**
 * 查询sku数据表
 * @param url、产品id、color、ramId
 */
function selectBySku(url, id, colorId, ramId) {
	if (colorId > 0 && ramId > 0 && id > 0) {
		fetch(url + '/getsku', {
				method: "POST",
				headers: {
					"Content-Type": "application/json",
					"Accept": "application/json"
				},
				credentials: 'include',
				body: JSON.stringify({
					proId: id,
					specValueOne: colorId,
					specValueTow: ramId
				})
			}).then(resp => resp.json())
			.then(data => {
				console.log(data.data);
				var data = data.data;
				if (data != undefined) {
					$(".pro_tit>h2").text(data.sku_name);
					$(".pro_price>.pro_memberprice>b").text(data.price.toFixed(2));
					$("#skuno").val(data.id);
				}
			});
	}
};

//购买数量选择
$("#skuNumber").blur(function() {
	let number = $("#skuNumber").val();
	if (number === null || number === "") {
		$("#skuNumber").val(1);
	}
});
/**
 * 点击加入购物车函数
 */

function cart(s) {
	const userid = $("#userid").val();
	const skuNumber = $("#skuNumber").val();
	var skuId = $("#skuno").val();
	if (userid == null || userid == "") {
		alert("您好，请先登录！");
		window.location.href = "login.html";
		return false;
	} else if (skuId == null || skuId == "" || skuId == 0) {
		alert("暂无此产品请重新选择！");
	} else if (skuNumber == null || skuNumber === "" || skuNumber == 0) {
		alert("请选择数量！");
	}
	const unitprice = $("#unitprice").text();
	if (unitprice != 0) {
		let price = accMul(skuNumber, unitprice);
		console.log("用户ID：" + userid + "sku_id：" + skuId + "，数量：" + skuNumber + "库存：" + $("#stock").text() + "单价：" +
			unitprice + ",总价：" + price);
		//加入购物车请求
		if (price > 0) {
			fetch(url + '/addCart', {
					method: "POST",
					headers: {
						"Content-Type": "application/json",
						"Accept": "application/json"
					},
					credentials: 'include',
					body: JSON.stringify({
						number: skuNumber,
						sku_id: skuId,
						user_id: userid,
						prices: price
					})
				}).then(resp => resp.json())
				.then(data => {
					if (data.code === 200) {
						alert("加入购物车成功");
						getCountByCart(url, userid);
					} else {
						alert("请选择规格");
					}
				});
		}
	}
};

//放大展示图
function zoomin() {
	document.getElementsByClassName("TJPinglun")[0].style.height = document.getElementsByClassName("tuijian_tab")[0].scrollHeight +
		"px";
	var box = document.getElementsByClassName("pts_pictureShow")[0];
	var small = box.children[0];
	var big = box.children[1];
	var bigImg = big.children[0];
	var mask = small.children[1];

	//big和mask在鼠标移入small时显示,移除隐藏
	small.onmouseenter = function() {
		big.style.display = "block";
		mask.style.display = "block";
	}
	small.onmouseleave = function() {
		big.style.display = "none";
		mask.style.display = "none";
	}

	small.onmousemove = function(event) {
		event = event || window.event;
		//mask跟随鼠标移动,且不会超出small范围
		//x作为mask的left值,y作mask的top值
		var pagex = event.pageX || scroll().left + event.clientX;
		var pagey = event.pageY || scroll().top + event.clientY;

		//减去mask宽高的一半,让鼠标在mask的中间
		var x = pagex - box.offsetLeft - mask.offsetWidth / 2;
		var y = pagey - box.offsetTop - mask.offsetHeight / 2;

		//不让mask超出small
		if (x < 0) {
			x = 0;
		}
		if (x > small.offsetWidth - mask.offsetWidth) {
			x = small.offsetWidth - mask.offsetWidth;
		}
		if (y < 0) {
			y = 0;
		}
		if (y > small.offsetHeight - mask.offsetHeight) {
			y = small.offsetHeight - mask.offsetHeight;
		}

		mask.style.left = x + "px";
		mask.style.top = y + "px";

		//bigImg跟随mask移动
		//比例=大图移动距离/mask移动距离=大图/小图
		var scale = bigImg.offsetWidth / small.offsetWidth;

		bigImg.style.marginLeft = -scale * x + "px";
		bigImg.style.marginTop = -scale * y + "px";
	}
}

$(".numberinus")[0].onclick = function() {
	if ($(".pronumber")[0].value > 1) {
		$(".pronumber")[0].value -= 1
	}

}
$(".numberplus")[0].onclick = function() {
	$(".pronumber")[0].value = Number($(".pronumber")[0].value) + 1
}
//导航栏监听滚动条
$(window).scroll(function() { //开始监听滚动条
	var top = $(document).scrollTop(); //滚动条距离顶部的高度
	var mynav = document.getElementById("navigation")
	if (top > 160) {
		mynav.setAttribute('style', 'position:fixed');
	} else {
		mynav.setAttribute('style', 'position:relative');
	}

});
