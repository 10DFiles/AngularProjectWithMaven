/**
 * 
 */

studentapp
		.controller(
				'AddStudentController',
				[
						"$log",
						"$scope",
						"$http",
						"$location",
						function($log, $scope, $http, $location) {
							var s = $scope;
							/* var j=AddStudentService; */
							var hp = $http;

							s.test = function() {

								console.log("calling test");
								$location.url('/AddStudent');
							}

							/*
							 * s.submitdetails=function(){ console.log("service
							 * to called"); servicefn(s);
							 * 
							 *  }
							 */

							// AddStudentService.servicefn(s);

							s.details = {

								name : '',

								studentID : '',

								mark : '',

								address : ''

							};
							s.submitdetails = function() {
								console.log("Ajax call to get to service");

								console.log(s.details.name);
								console.log(s.details.studentID);
								console.log(s.details.mark);
								console.log(s.details.address);
								$http(
										{

											url : 'http://localhost:8080/AngularjsStudentCurd/Rest/student/AddStudentDetails',
											data : angular.toJson(s.details),
											method : 'POST',
											headers : {
												'Accept' : 'application/json'
											}
										}).success(function(response) {
									if (response != null) {

										s.details = response;
										console.log(JSON.stringify(response));
										$location.url('/');
										windows.alert("Student Added Succesfully");
										$log.log("Student Addedd");
									}
								}).error(function(response) {
								});

							}

						} ]);
