//slide show
var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}

function showPassword() {
    var password = document.getElementById("password");
    var showPass = document.getElementById("showpass");
    if(showPass.checked){
        password.type = "text";
        } else {
            password.type = "password";
        }
    }
function checkwin(){
    alert("fuck");
    alert(document.getElementById("img1").style.height);
}

function addSectionActive(x){
    var section = document.getElementsByName("section");
    for(var i=0;i<section.length;i++){
        section[i].classList.remove("sectionActive");
    } 
    section[x].classList.add("sectionActive");
}
