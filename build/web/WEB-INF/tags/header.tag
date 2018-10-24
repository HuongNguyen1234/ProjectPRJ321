<%-- 
    Document   : header
    Created on : Oct 24, 2018, 3:56:21 AM
    Author     : Nguyen Bao Long
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<html>
    <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <body>
        <!--slide show-->
        <div style="width: 100%;height: 50px;background-color: rgb(229, 99, 21); ">          
            <button onclick="document.getElementById('modalLogin').style.display='block'" style="position:absolute;top: 5px;right:5px;width: 60px;height: 40px; background-color: #4CAF50; border-radius: 5px;">Login</button>
            
            <div id="modalLogin" class="modal"> 
                <form class="modal-content animate" method="post" action="Login">
                  <div class="imgcontainer">
                    <span onclick="document.getElementById('modalLogin').style.display='none'" class="close" title="Close Modal">&times;</span>
                    <img src="Image/avatar3.png" alt="Avatar" class="avatar">
                    <center><h1 style="position: absolute;left:0;right:0;margin-left:auto;margin-right:auto;bottom: 0;color: white;">Sign In</h1></center>
                  </div>

                  <div class="login-container-main">
                      <table style="width: 100%;">                        
                          <tr>
                              <td colspan="1">
                                <div class="placeholder">
                                    <div class="innerplaceholder">
                                        <i class="fa fa-user-secret" style="font-size: 20px;white-space: nowrap;" > User</i>
                                        
                                    </div>                         
                                </div>
                              </td>
                              <td colspan="4">
                                  <input class="inputtext" type="text" name="name" required>          
                              </td>
                          </tr>                         
                          <tr>
                              <td colspan="1">
                                <div class="placeholder">
                                    <div class="innerplaceholder" style="">
                                        <i class="fa fa-lock" style="font-size: 20px;white-space: nowrap; "> Password</i>
                                        
                                    </div>
                                </div>                                 
                              </td>
                              <td colspan="4">
                                  <input class="inputtext" type="password" name="password" id="password" required>
                              </td>
                          </tr>
                          <tr>
                              <td colspan="5">
                                  <button type="submit" class="login-button" >Login</button>
                              </td>
                          </tr>
                          <tr>
                              <td colspan="3">
                                  <b style="color: white">***</b>
                                <label class="switch">                    
                                    <input type="checkbox" id="showpass" onclick="showPassword()">
                                    <span class="slider round" id="rounder"></span>
                                </label>
                                  <b style="color: white">abc</b>
                              </td>
                              <td colspan="2">
                                <div style="float: right;margin: 20px 0;">
                                    <input type="checkbox" name="remember"> <b style="color: white">Remember me</b>
                                </div>
                              </td>
                          </tr>
                      </table>                                    
                  </div>

                  <div class="login-container-end">
                      <a href="" class="login-end">forgot password</a>
                  </div>
                </form>
            </div>
        </div>
        <div class="slideshow-container">          
        <div class="mySlides fade">
            <img src="Image/flashbox.jpg" style="width:100%;position: absolute;height: 500px;" >
            
            <div class= "flashPostContain">
                <center><p class="flashPostHeader" >Flash Post</p></center>  
                <p class="flashPostContent">
                    I have bought many Major W I have bought many Major W 
                    I have bought many Major WI have bought many Major WI have bought many Major WI have bought many Major W
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                </p>
                <center><button class="flashPostButton" onclick="checkwin()">Flash Post</button></center>             
            </div>                
            <div class="numbertext">1 / 3</div>     
            <div class="text">Caption Text</div>       
        </div>
        
        <div class="mySlides fade">
            <img src="Image/flash.jpg" style="width:100%;position: absolute;height: 500px;">
            <div class= "flashPostContain">
                <center><p class="flashPostHeader" >Flash Post</p></center>  
                <p class="flashPostContent">
                    I have bought many Major W I have bought many Major W 
                    I have bought many Major WI have bought many Major WI have bought many Major WI have bought many Major W
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                </p>
                <center><button class="flashPostButton" style="">Flash Post</button></center>
            </div>
            
          <div class="numbertext">2 / 3</div>
          
          <div class="text">Caption Two</div>
        </div>
        <div class="mySlides fade">
            <img src="Image/backgroundtechnology.jpg" style="width:100%;position: absolute;height: 500px;">
            <div class= "flashPostContain">
                <center><p class="flashPostHeader" >Flash Post</p></center>  
                <p class="flashPostContent">
                    I have bought many Major W I have bought many Major W 
                    I have bought many Major WI have bought many Major WI have bought many Major WI have bought many Major W
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                    I have bought many Major WI have bought many Major WI have bought many Major Wf
                </p>
                <center><button class="flashPostButton" >Flash Post</button></center>
            </div>            
          <div class="numbertext">3 / 3</div>
          
          <div class="text">Caption Three</div>
        </div>
        
        <div style="position: absolute;bottom: 10px;right: 50%;" >
          <span class="dot" onclick="currentSlide(1)"></span> 
          <span class="dot" onclick="currentSlide(2)"></span> 
          <span class="dot" onclick="currentSlide(3)"></span> 
        </div>
            
        <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
        <a class="next" onclick="plusSlides(1)">&#10095;</a>
        
        </div>
        
        <!--slide show-->    
        <nav>          
        <div class="navbar">
          <div style="width: 150px;float: left;height: 10px;">
              <img src="Image/logoflash.png" style="z-index: 1;position: absolute;left: 50px;border: 2px solid wheat;z-index: 2;" width="80" height="50">
          </div>
          <a href="#home">Home</a>
          <a href="#about">About</a>
          <div class="subnav">
            <button class="subnavbtn">Services <i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="#bring">Tra cứu</a>
              <a href="#deliver" onclick="addSectionActive(1)">Tính giá cước</a>
              <a href="#package">Mạng lưới</a>
              <a href="#package">Bưu cục</a>
            </div>
          </div> 
          <div class="subnav">
            <button class="subnavbtn">Contact <i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="#link1">Điền thông tin đơn hàng</a>
              <a href="#link2">Cập nhật trạng thái hành trình</a>
              <a href="#link3">Quét mã QR</a>
            </div>
          </div>
<!--          <div class="dropdown ">
            <button class="dropbtn">Dropdown 
              <i class="fa fa-caret-down"></i>
            </button>-->
<!--            <div class="dropdown-content">
              <div class="header">
                <h2>Mega Menu</h2>
              </div>   
              <div class="row">
                <div class="column">
                  <h3>Category 1</h3>
                  <a href="#">Link 1</a>
                  <a href="#">Link 2</a>
                  <a href="#">Link 3</a>
                </div>
                <div class="column">
                  <h3>Category 2</h3>
                  <a href="#">Link 1</a>
                  <a href="#">Link 2</a>
                  <a href="#">Link 3</a>
                </div>
                <div class="column">
                  <h3>Category 3</h3>
                  <a href="#">Link 1</a>
                  <a href="#">Link 2</a>
                  <a href="#">Link 3</a>
                </div>
              </div>
            </div>-->
          <!--</div>-->      
        </div>           
        </nav>
    </body>
</html>