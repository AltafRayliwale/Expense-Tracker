// console.log("Benstock")

// let name ="Altaf";
// name=26;
//  let age=26;
//  let isTeacher = false;
//  let job = undefined;
//  let pockets = nulls;


//  let object ={
//     name :" Altaf",
//     age :26,
//     isTeacher : false,

//  };

//  console.log(object.age)
//  console.log(object["name"]);

// let A=["Altaf",33,false];

// console.log(A[1]);
// console.log(A[0][2]);

// console.log(true == "true");
// console.log(true === "true");

// console.log(1 -'1');

// let A1 = ["Altaf",33,false];
// for(let i of A1){
//     console.log(i);
// }

// function fun(name){
//     console.log("Hello"+name);
//     return true
// }

// console.log(fun("Altaf"))





function User(u_name , u_pass)
{
  this.count=0;
  this.name=u_name;
  this.pass=u_pass;

}

User.prototype.login=function(){
    console.log("inside login");
};

var user1 = new User("altaf","28");
var user2 = new User("Bhide","22");

console.log(user1);
console.log(user2);


function Admin(...args){
    User.apply(this,args);
    this.role="Admin";

}

Admin.prototype = Object.create(User.prototype);
Admin.prototype.fum = function(){
    console.log("inside admin");
};
 
var admin1 = new Admin("moo","mo@gmail.com");
var admin2 = new Admin("moo","mo@gmail.com");

console.log(admin1);
console.log(admin2);