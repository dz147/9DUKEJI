/* top Brand */
const url = "http://localhost:8083";




//首次加载查询渲染数据
function proPage(page) {
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
			getData(products);
		});
};

function getData(data) {
	$("#liList").html("");
	var ul = $("#liList");
	var li = "";
	$(data).each(function(index, pros) {
		li += '<li class="itemlist">';
		li += '<div class="product-border">    ';
		li += '<div class="prophoto">';
		li += '<a href="goods.html?id=' + pros.prod_no + '" >';
		li +=
			'<img src="./images/' + pros.picture + '" />';
		li += '</a>';
		li += '</div>';
		li += '<div class="procontent" >';
		li += '<div class="pro_box_cont">';
		li += '	<div class="proinfo">';
		li += '		<p class="t">';
		li += '			<a href="goods.html?id=' + pros.prod_no + '" >' + pros.prod_name +'</a>';
		li += '		</p>';
		li += '		<p class="m">';
		li += '			￥'+pros.low_price.toFixed(2)+'';
		li += '		</p>';
		li += '		<p>';
		li += '			交易成功：'+pros.sales+'';
		li += '		</p>';
		li += '	</div>';
		li += '</div>';
		li += '	<div class="probuy">';
		li += '		<a class="addstore fl"><span>加入购物车</span></a>';
		li += '		<a class="mybuy"><span>立即购买</span></a>';
		li += '	</div>';
		li += '	<br/>';
		li += '</div>';
		li += '</div>';
		li += '</li>';
	});
	ul.append(li);
};


//获得Product总条数
function getProductCount() {
	fetch(url + '/selectProd/1', {
			method: "GET",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include'
		}).then(resp => resp.json())
		.then(data => {
			$("#PageCount").val(data.pageSize);
			$(".sequence_all span").text(data.pageSize);
			console.log($("#PageCount").val());
			loadpage();
		});
};

function exeData(num, type) {
	loadpage();
};

//加载页数
function loadpage() {
	var myPageCount = parseInt($("#PageCount").val());
	var myPageSize = parseInt($("#PageSize").val());
	var countindex = myPageCount % myPageSize > 0 ? (myPageCount / myPageSize) + 1 : (myPageCount / myPageSize);
	$("#countindex").val(countindex);

	$.jqPaginator('#pagination', {
		totalPages: parseInt($("#countindex").val()),
		visiblePages: parseInt($("#visiblePages").val()),
		currentPage: 1,
		first: '<li class="first"><a href="javascript:;">首页</a></li>',
		prev: '<li class="prev"><a href="javascript:;"><i class="arrow arrow2"></i>上一页</a></li>',
		next: '<li class="next"><a href="javascript:;">下一页<i class="arrow arrow3"></i></a></li>',
		last: '<li class="last"><a href="javascript:;">末页</a></li>',
		page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
		onPageChange: function(num, type) {
			if (type == "change") {
				proPage(num);
				exeData(num, type);
			}
		}
	});
};

// left销量数据
function getSales(url){
	fetch(url + '/getSales', {
			method: "get",
			credentials: 'include',
		}).then(resp => resp.json())
		.then(data => {
			var data = data.data;
			//console.log(data);
			salesStr = "";
			$(data).each(function(index, pros) {
				salesStr += '<li>';
				salesStr += '<div class="com-img">';
				salesStr += '<a href="goods.html?id='+ pros.prod_no +'">';
				salesStr += '<img src="images/'+ pros.picture +'" alt=""/>';
				salesStr += '</a>';
				salesStr += '</div>';
				salesStr += '<div class="com-proinfo">';
				salesStr += '<p class="pro-name">';
				salesStr += '<a href = "goods.html?id='+ pros.prod_no +'" > '+ pros.prod_name +' </a>';
				salesStr += '</p>';
				salesStr += '<p class="pro-price">';
				salesStr += '￥<span>'+ pros.low_price.toFixed(2) +'</span>';
				salesStr += '</p>';
				salesStr += '<p class="pro-Count">';
				salesStr += '已售出<span>'+ pros.sales +'</span>件';
				salesStr += '</p>';
				salesStr += '</div>';
				salesStr += '<div class="com-probg"></div>';
				salesStr += '</li>';
			});
			$(".Commend-pro ul").append(salesStr);
		});
};
