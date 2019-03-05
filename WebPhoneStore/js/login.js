function usersLogin(url, name, pwd) {
	fetch(url + '/userLogin', {
			method: "POST",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include',
			body: JSON.stringify({
				user_phone: name,
				user_pwd: pwd
			})
		}).then(resp => resp.json())
		.then(data => {
			console.log(data);
			if (data.data === null) {
				alert("账号密码错误，请重试。");
			} else {
				window.location.href = "index.html";
			}
		});
};

function loadingUser(url) {
	fetch(url + '/userLogin', {
			method: "get",
			credentials: 'include',
		}).then(resp => resp.json())
		.then(data => {
			console.log(data);
			if (data.data != null && data.data != "") {
				$("#userName").text(data.data.user_name);
				$("#userName").attr("href","#");
				$("#userid").val(data.data.user_id);
				getCountByCart(url, data.data.user_id);
			}
		});
};

function createUser(url,jdUser) {
	fetch(url + '/createUser', {
			method: "POST",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			},
			credentials: 'include',
			body: JSON.stringify(jdUser)
		}).then(resp => resp.json())
		.then(data => {
			if (data.code === 200) {
				window.location.href = "index.html";
			}
		});
}
