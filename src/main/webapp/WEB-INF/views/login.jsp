<!-- <form action="/dologin" method="post"> -->
<!-- UserName<input type="text" name="username"/> -->
<!-- Password<input type="text" name="password"/> -->
<!-- <input type="submit"> -->
<!-- </form> -->

<form class="form-signin" method="post" action="/dologin">
		<label for="username" class="sr-only">Username</label> <input
			type="text" id="username" name="username" class="form-control"
			placeholder="Username" required autofocus>
		<label for="password" class="sr-only">Password</label> <input
			type="password" id="password" name="password" class="form-control"
			placeholder="Password" required>
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
		in</button>
</form>