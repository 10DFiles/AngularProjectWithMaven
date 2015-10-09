studentapp.service('studentService', function() {

	var stuID;

	this.studentId = function(contact) {

		stuID = contact;
		console.log("id value in service" + stuID);

	}
	
	this.getid=function(){
		
		console.log("stuID in getid() in service--"+stuID);
		return stuID;
	}

});

/* return{
	studentId: {},
    setID: function (data) {
        studentId = data;
        console.log("StudentId in factory");
        console.log(studentId);
    }
	
	var studentfactory{};
	
	studentfactory.getStudentId=function(data)
	{
		studentfactory=data;
		
	}
	
	return studentfactory;
	
	
}*/

