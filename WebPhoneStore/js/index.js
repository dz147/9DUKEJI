/* top Brand */
const url = "http://localhost:8083";

function loadingBrand(url) {
	fetch(url + '/selectBrand', {
			method: "get",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include'
		}).then(resp => resp.json())
		.then(data => {
			let brands = data.data;
			let str = "";
			$(brands).each(function(index, obj) {
				str += '<li><a href="javascript:;" data-id="' + obj.brand_id + '" onclick="getBrandId(this)">' + obj.brand_name +
					'</a></li>';
			});
			$("#brandList").append(str);
		});
};

function getBrandId(s) {
	let brandId = s.getAttribute("data-id"); /*  */
	fetch(url + '/selectByBrandId/' + brandId + '', {
			method: "GET",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include'
		}).then(resp => resp.json())
		.then(data => {
			var products = data.page;
			renderData(products);
		});
};

//首次加载查询渲染数据
function myPage(page) {
	fetch(url + '/selectProd/' + page + '', {
			method: "GET",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include'
		}).then(resp => resp.json())
		.then(data => {
			var products = data.page;
			renderData(products);
		});
};

function renderData(data) {
	$("#productList").html("");
	var list = "";
	$(data).each(function(index, pros) {
		if(index < 8){
			list += '<div class="yk_dress fl" ">';
		list += '<a href="goods.html?id=' + pros.prod_no + '" ><img src="./images/' + pros.picture + '" /></a>';
		list += '<div class="yk_span"><a href="goods.html?id=' + pros.prod_no + '" >';
		list += '<div class="product_price"><span>￥' + pros.low_price.toFixed(2) +
			'</span></div><br/>';
		list += '<div class="product_name" ><span>' + pros.prod_name +
			'</span></div></a></div>';
		list += '</div><p></p>';
		}
		
	});
	$("#productList").append(list);
};



