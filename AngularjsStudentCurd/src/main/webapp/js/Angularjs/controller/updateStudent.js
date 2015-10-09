/**
 * 
 */

studentapp
		.controller(
				'UpdateStudentController',
				[
						"$log",
						"$scope",
						"$http",
						"$location",
						"studentService",
						function($log, $scope, $http, $location, studentService) {
							var s = $scope;

							s.details = {

								id : 0,

								name : '',

								studentID : '',

								mark : '',

								address : ''

							};

							

							// To get particular student values for Update
							s.init = function() {

								s.studentId = studentService.getid();

								s.details.id = s.studentId;
								console.log("id in init Function"
										+ s.details.id);
								console
										.log(" Student value while UpdateStudent.js file Load.-- "
												+ s.details.id);
								console.log("value in details object"
										+ JSON.stringify(s.details));
								$http(
										{
											url : 'http://localhost:8080/AngularjsStudentCurd/Rest/find/GetStudentDetails?id='
													+ s.details.id,

											method : 'GET',

										})
										.success(
												function(response) {
													if (response != null) {
														s.details = response;
														console
																.log("response"
																		+ JSON
																				.stringify(response));
														console
																.log("update Successfull");

														/* $location.url("/ListOfStudent") */
													}
												}).error(function(response) {
											console.log("Update fail");
										});

							}

							s.init();
							s.test = function() {
								console
										.log("update student page to be redirected");
								$location.url("updateStudent")

							}
							
							s.cancel=function()
							{
								console.log("Back to ListOfStudent");
								$location.url("/ListOfStudent");
							}
							
							
							
							s.submitdetails = function() {
								console.log("to update in Db,Ajax");

								console.log(JSON.stringify(s.details));
								$http(
										{

											url : 'http://localhost:8080/AngularjsStudentCurd/Rest/update/UpdateStudentDetails',
											data : angular.toJson(s.details),
											method : 'POST',
											headers : {
												'Accept' : 'application/json'
											}
										}).success(function(response) {
									if (response != null) {

										s.details = response;
										console.log(JSON.stringify(s.details));
										$location.url('/ListOfStudent');

										$log.log("Student Updated");
									}
								}).error(function(response) {
								});

							}

						} ]);
