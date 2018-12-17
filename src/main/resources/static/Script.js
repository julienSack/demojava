$(document).ready(function() {

 $.get("http://localhost:8090/contacts",

     function (data) {
      data.forEach(function (contact) {


      });
      addTaskForm.addEventListener('submit', function (event) {
       event.preventDefault();
       event.stopPropagation();
       console.log(addTaskCategory.value);
      });
     }
 )
})