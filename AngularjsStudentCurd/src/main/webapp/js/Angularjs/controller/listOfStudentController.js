/**
 * list of Student
 */

studentapp
		.controller(
				'listOfStudentController',
				[
						"$log",
						"$scope",
						"$http",
						"$location",
						"studentService",
						function($log, $scope, $http, $location,studentService) {
							var self = $scope;
							var hp = $http;

							var value;
							var id;
							var details;
							self.hello = [];

							//To Delete Student In Database

							self.remove = function(id) {

								console.log("1 of Student is going to delete");
								self.id = id;
								$log.log(self.id);
								console.log("value in Array object")
								$log.log(self.value);

								var index = -1;
								var StudentList = eval(self.value);
								for (var i = 0; i < StudentList.length; i++) {
									if (StudentList[i].id === id) {
										index = i;
										break;
									}
								}
								if (index === -1) {
									alert("Something gone wrong");
								}
								self.value.splice(index, 1);

								$http(
										{
											url : 'http://localhost:8080/AngularjsStudentCurd/Rest/delete/DeleteStudentById?id='
													+ self.id,
											method : 'GET',
										}).success(function(response) {
									if (response != null) {

										$location.url("/ListOfStudent")
									}
								}).error(function(response) {
								});

							}

							self.modify = function(id) {

								self.id = id;
								console.log("id to modify" + id);

								studentService.studentId(id);
								
								$location.url("/UpdateStudent");

							}
							

							//To list the Student in database
							self.init = function() {
								$http(
										{
											url : 'http://localhost:8080/AngularjsStudentCurd/Rest/list/listOfStudent'
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
																.url('/ListOfStudent');
													}
												}).error(function(response) {
										});
							}

							self.init();
						} ]);



