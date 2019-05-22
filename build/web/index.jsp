<%-- 
    Document   : index
    Created on : May 16, 2017, 1:10:06 PM
    Author     : Sanu Vithanage
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sanu-Shopping-Cart</title>
        <link rel="stylesheet" type="text/css" href="css/boostrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css" href="css/newcss.css">
        <script type="text/javascript">
            var total = 0;
            var oldValue = 0;
        </script>
    </head>
    <body>

        <div class="navbar navbar-fixed-top  sd">
            <div class="container-fluid"> 
                <div class="navbar-header">
                    <div class="navbar-brand">Sanu-Shopping Cart</div>
                </div>
            </div>
        </div>
        <div class="row" style="margin-top: 20px"></div>
        <div class="row" style="margin-top: 60px">
            <div class="container-fluid">
                <!--<div class="col-md-1"></div>-->
                <div class="col-md-4 ssd">
                    <h2 class="wh">Item Table</h2>
                    <table class="table table-bordered  tbl1">
                        <thead>
                            <tr>
                                <th>Item Name</th>
                                <th>Item Price</th>
                                <th>Buy Item</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Mouse</td>
                                <td>350</td>
                                <td><a class="act" href="cart?item=Mouse&price=350&qty=0&del=false">Buy This</a></td>
                            <tr>
                                <td>KeyBoard</td>
                                <td>250</td>
                                <td><a class="act" href="cart?item=KeyBoard&price=250&qty=0&del=false">Buy This</a></td>
                            <tr>
                                <td>WebCam</td>
                                <td>1550</td>
                                <td><a class="act" href="cart?item=WebCam&price=1550&qty=0&del=false">Buy This</a></td>
                            <tr>
                                <td>Printer</td>
                                <td>3350</td>
                                <td><a class="act" href="cart?item=Printer&price=3350&qty=0&del=false">Buy This</a></td>
                            <tr>
                                <td>Moniter</td>
                                <td>20000</td>
                                <td><a class="act" href="cart?item=Moniter&price=20000&qty=0&del=false">Buy This</a></td>
                            </tr>
                            <tr>
                                <td>Ram</td>
                                <td>1500</td>
                                <td><a  class="RE" onclick="alert('Rams Are Out Of Order')">Buy This</a></td>
                            </tr>
                            <tr>
                                <td>PenDrive</td>
                                <td>1000</td>
                                <td><a class="RE" onclick="alert('PenDrives Are Out Of Order')">Buy This</a></td>
                            </tr>
                            <tr>
                                <td>Book</td>
                                <td>100</td>
                                <td><a class="RE" onclick="alert('Books are Out Of Order')">Buy This</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-1 fcol"></div>
                <!--//////////////-->
                <!--<div class="col-md-1"></div>-->
                <div class="col-md-5" id="sd">
                    <h2>Cart</h2>
                    <table class="table table-bordered table-bordered" id="tblCaret">
                        <thead>
                            <tr>
                                <th>Item Name</th>
                                <th>Item Quntity</th>
                                <th>Item Price</th>
                                <th>Sub Total</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody id="nn">

                        </tbody>

                    </table>
                    


                    <div class="row fi">
                        <div class="jumbotron">
                            <div class="col-md-6">
                                <div class="container-fluid">
                                    <div class="total">
                                        Total :  <span id="sds"></span><sub>Rs.</sub>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="container-fluid">
                                    <div class="total">
                                       Items On Cart : <span id="spnTotalItems"><span>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>


                    <%
                        ArrayList<Cart> list = (ArrayList) request.getSession().getAttribute("cart");
                        if (list == null) {
                            list = new ArrayList<Cart>();
                        }
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print(list.get(i).getItemPrice());
                    %>
                    <script type="text/javascript">
                        {
                            var tbl = document.getElementById("tblCaret").tBodies[0];
                            var row = tbl.insertRow(-1);
                            row.onclick = function (evt) {
                                this.cells[1].childNodes[0].focus();
                            };
                            var cell0 = row.insertCell(0);
                            cell0.innerHTML = "<%= list.get(i).getItemname()%>";
                            var cell1 = row.insertCell(1);
                            var txt = document.createElement("input");
                            txt.setAttribute("txtProductName", cell0.innerHTML);
                            txt.className = "qtyTxt";
                            txt.maxLength = 2;
                            txt.value = "<%= list.get(i).getQuntity()%>";
                            txt.onfocus = function () {
                                oldValue = this.value;
                                this.select();
                            };
                            txt.onblur = function () {
                                if (this.value.trim().length === 0 || parseInt(this.value.trim()) === 0) {
                                    this.value = oldValue;
                                } else {
                                    if (this.value !== oldValue.toString())
                                        window.open("cart?item=" + this.getAttribute("txtProductName") + "&price=" + this.value.trim() + "&qty=" + this.value.trim(), "_self");
                                }
                            };
                            txt.onkeyup = function (evt) {
                                var reg = new RegExp("[^0-9]", "g");
                                this.value = this.value.replace(reg, "");
                                if (evt.keyCode === 13) {
                                    this.blur();
                                }
                            };
                            cell1.appendChild(txt);
                            var cell2 = row.insertCell(2);
                            cell2.innerHTML = "<%= list.get(i).getItemPrice()%>";
                            var cell3 = row.insertCell(3);
                            total += parseInt(txt.value) * parseInt(cell2.innerHTML);
                            cell3.innerHTML = parseInt(txt.value) * parseInt(cell2.innerHTML) + "";

                            document.getElementById("spnTotalItems").innerHTML = "<%= i + 1%>";
                            document.getElementById("sds").innerHTML = total;
                            var cell4 = row.insertCell(4);
                            var tx = document.createElement("button");
                            tx.setAttribute("itemName", cell0.innerHTML);
                            tx.setAttribute("itemPrice", cell2.innerHTML);

                            tx.className = "but";
                            tx.maxLength = 2;
                            tx.value = "<%= list.get(i).getQuntity()%>";
                            tx.onfocus = function () {
                                oldValue = this.value;
                                this.select();
                            };
                            tx.onblur = function () {
                                if (this.value.trim().length === 0 || parseInt(this.value.trim()) === 0) {
                                    this.value = oldValue;
                                } else {
                                    if (this.value !== oldValue.toString())
                                        window.open("cart?item=" + this.getAttribute("txtProductName") + "&price=" + this.value.trim() + "&qty=" + this.value.trim(), "_self");
                                }
                            };
                            tx.onkeyup = function (evt) {
                                var reg = new RegExp("[^0-9]", "g");
                                this.value = this.value.replace(reg, "");
                                if (evt.keyCode === 13) {
                                    this.blur();
                                }
                            };
                            cell4.appendChild(tx);
                            tx.onclick = function () {
                                var last = this.value;
                                var temp = last - 1;
                                window.open("cart?item=" + this.getAttribute("itemName") + "&price=" + 500 + "&qty=" + temp + "&del=true", "_self");
                            }
                        }
                    </script>

                    <%
                        }
                    %>
                </div>

                <div class="col-md-1"></div>
            </div>
        </div>
                <button class="btn btn-primary ds">Proceed CheckOut</button>
        <div class="navbar-fixed-bottom foot">
            <footer id="ft">Developed By Sanu Vithanage</footer>
        </div>
    </div>

</body>
</html>
