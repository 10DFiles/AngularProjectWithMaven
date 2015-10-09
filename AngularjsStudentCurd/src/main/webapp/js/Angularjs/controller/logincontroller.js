studentapp
		.controller(
				"LoginController",
				[
						"$log",
						"$scope",
						"$rootScope",
						"$location",
						"$http",
						function($log, $scope, $rootScope, $location, $http) {

							console.log("i am in login controller");
							var self = $scope;
							self.user = {};
							self.link = 'http://localhost:8080/AngularjsStudentCurd/Rest';
							self.userObjTemp = {};
							self.hello = [];
							self.doLogin = function() {
								$log.log("User value ", self.user);
								var c = link
										+ 'j_spring_security_check?j_username='
										+ self.user.userName + '&j_password='
										+ self.user.password;
								$http({
									url : c,
								})
										.success(
												function(response) {
													if (response != null) {

														for (var int = 0; int < response.length; int++) {
															self.hello
																	.push(response[int]);
														}
														self.value = self.hello;

														$log
																.log("Student list Displayed");
														$log.log(self.value);

														$location
																.url('/welcome');
													}
												}).error(function(response) {
										});
							};

						} ]);
