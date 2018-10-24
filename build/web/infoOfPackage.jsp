<%-- 
    Document   : infoOfPackage
    Created on : Oct 22, 2018, 8:42:26 PM
    Author     : victor van dog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="CSS/Style.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="CSS/infoStyle.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>       
        <div  class="container">
            <div  class="row">
                <div  class="col-sm-9" >
                    <div class="div-1"> 
                        <table class="table">
                            <tr>
                                <th ><i class="fas fa-barcode"></i>&nbsp;Mã Sản Phẩm <br>
                                    CB05555555
                                </th>
                                <th><i class="fas fa-qrcode"></i>&nbsp;Mã QR <br>
                                </th> 
                                <th><i class="far fa-check-circle"></i>&nbsp; Trạng thái<br>
                                </th>
                            </tr>
                        </table>
                    </div>
                    <hr>
                    <div class="div-2">
                        <table class="table2" >
                            <tr>
                                <td> Bưu Cục Gửi : 10 - Hà Nội</td>
                                <td> Bưu Cục Nhận: 920000 - Rạch Giá    </td>
                            </tr>
                            <tr>
                                <td>
                                    Thời gian chuyển đi : 30/1/2012 
                                </td>
                                <td>
                                   Thời gian đến nơi : 30/4/2018
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" >
                                   Người Nhận : Nguyễn Thu Hường
                                </td>
                            </tr>
                              <tr>
                                <td colspan="2" >
                                    Thành Tiền : 320.000đ
                                </td>
                            </tr>

                        </table>



                    </div>
                    <hr>


                    <div>
                        <h3>Hiện Trạng Gói Hàng</h3>
                        <hr style="border-top: dotted 3px;" /> 
                        
<!--                        Chỗ này để điền trạng thái gói hàng-->
                        
                        
                        
                        
                        <hr>
                        
                        

                    </div>


                </div >
                <div class="col-sm-3" >
                    <iframe id ="map" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!
                            1d3723.8977453149246!2d105.83245751424809!3d21.036777085994046!
                            2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!
                            1s0x3135aba15ec15d17%3A0x620e85c2cfe14d4c!2zTMSDbmcgSOG7kyBDaMOtIE1pbmg!
                            5e0!3m2!1svi!2sus!4v1501056274257" ></iframe>
                </div>
                <div class="clear"></div>

            </div>
        </div>

        <script src="JS/style.js" type="text/javascript"></script>
    </body>
</html>