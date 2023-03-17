
<%@page import="com.cart.model.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
   <title>Profile | Klorofil - Free Bootstrap Dashboard Template</title>
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
   <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
   <!-- VENDOR CSS -->
   <link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.min.css">
   <link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.min.css">
   <link rel="stylesheet" href="assets/vendor/linearicons/style.css">
   <!-- MAIN CSS -->
   <link rel="stylesheet" href="assets/css/main.css?g=11">
   <!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
   <link rel="stylesheet" href="assets/css/demo.css">
   <!-- GOOGLE FONTS -->
   <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
   <!-- ICONS -->
   <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
   <link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
</head>

<body>
   <% List<BoardDTO> list = (List)request.getAttribute("list"); %>
   <!-- WRAPPER -->
   <div id="wrapper">
      <!-- NAVBAR -->
      <nav class="navbar navbar-default navbar-fixed-top">
         <div class="brand">
            <a href="Main.do"><img src="assets/img/logo247.png" alt="Klorofil Logo" class="img-responsive logo"></a>
         </div>
         <div class="container-fluid">
            <div class="navbar-btn">
               <button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
            </div>
            <form class="navbar-form navbar-left">
               <div class="input-group">
                  <input type="text" value="" class="form-control" >
                  <span class="input-group-btn"><button type="button" class="btn btn-warning">Go</button></span>
               </div>
            </form>
            <div class="navbar-btn navbar-btn-right">
               <a class="btn btn-success update-pro" href="https://www.themeineed.com/downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
            </div>
            <div id="navbar-menu">
               <ul class="nav navbar-nav navbar-right">
                  <li class="dropdown">
                     <a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                        <i class="lnr lnr-alarm"></i>
                        <span class="badge bg-danger">5</span>
                     </a>
                     <ul class="dropdown-menu notifications">
                        <li><a href="#" class="notification-item"><span class="dot bg-warning"></span>System space is almost full</a></li>
                        <li><a href="#" class="notification-item"><span class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
                        <li><a href="#" class="notification-item"><span class="dot bg-success"></span>Monthly report is available</a></li>
                        <li><a href="#" class="notification-item"><span class="dot bg-warning"></span>Weekly meeting in 1 hour</a></li>
                        <li><a href="#" class="notification-item"><span class="dot bg-success"></span>Your request has been approved</a></li>
                        <li><a href="#" class="more">See all notifications</a></li>
                     </ul>
                  </li>
                  <li class="dropdown">
                     <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="lnr lnr-question-circle"></i> <span>Help</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                     <ul class="dropdown-menu">
                        <li><a href="#">Basic Use</a></li>
                        <li><a href="#">Working With Data</a></li>
                        <li><a href="#">Security</a></li>
                        <li><a href="#">Troubleshooting</a></li>
                     </ul>
                  </li>
                  <li class="dropdown">
                     <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="assets/img/user.png" class="img-circle" alt="Avatar"> <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                     <ul class="dropdown-menu">
                        <li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
                        <li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
                        <li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
                     </ul>
                  </li>
                  <!-- <li>
                     <a class="update-pro" href="https://www.themeineed.com/downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
                  </li> -->
               </ul>
            </div>
         </div>
      </nav>
      <!-- END NAVBAR -->
      <!-- LEFT SIDEBAR -->
      <div id="sidebar-nav" class="sidebar">
         <div class="sidebar-scroll">
            <nav>
   <ul class="nav">
                  <li><a href="index.html" class="active"><i class="lnr lnr-home"></i> <span>Home</span></a></li>
                  <li>
                     <a href="#subPages" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i> <span>관리</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                     <div id="subPages" class="collapse ">
                        <ul class="nav">
                           <li><a href="Board.do" class="">게시판</a></li>
                           <li><a href="Video.do" class="">비디오</a></li>
                        </ul>
                     </div>
                  </li>
                  <!--  <li><a href="elements.html" class=""><i class="lnr lnr-code"></i> <span>Elements</span></a></li> -->
                  <li><a href="charts.html" class=""><i class="lnr lnr-chart-bars"></i> <span>수익차트</span></a></li>
                  <!-- <li><a href="panels.html" class=""><i class="lnr lnr-cog"></i> <span>Panels</span></a></li>  -->
                  <!--  <li><a href="tables.html" class=""><i class="lnr lnr-dice"></i> <span>Tables</span></a></li>
                  <li><a href="typography.html" class=""><i class="lnr lnr-text-format"></i> <span>Typography</span></a></li>
                  <li><a href="icons.html" class=""><i class="lnr lnr-linearicons"></i> <span>Icons</span></a></li> -->
               </ul>
            </nav>
         </div>
      </div>
      <!-- END LEFT SIDEBAR -->
      <!-- MAIN -->
      <div class="main">
         <!-- MAIN CONTENT -->
         <div class="main-content">
            <div class="container-fluid">
               <div class="panel panel-profile">
                  <div class="clearfix">
                     <!-- LEFT COLUMN -->
                  
                        
                        </div>
                        
                        <!-- END PROFILE HEADER -->
                        <!-- PROFILE DETAIL -->
                        
                        <!-- END PROFILE DETAIL -->
                     </div>
                     <!-- END LEFT COLUMN -->
                     <!-- RIGHT COLUMN -->
                     
                                 <table class="table project-table">
                           
                                    <thead>
                                       <tr>
                                          <th>순번</th>
                                          <th>제목</th>
                                          <th>작성자</th>                                          
                                          <th>작성날짜</th>
                                          <th></th>
                                       </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                    <td>1</td>
                                    <td>결제정보 수정하고싶어요</td>
                                    <td>스파이</td>
                                    <td>2023.02.16</td>
                                    </tr>
                                    <tr>
                                    <td>2</td>
                                    <td>모듈에서 핸드폰이 떨어졌는데 보상 안해주시나요?</td>
                                    <td>쿠크다스</td>
                                    <td>2023.02.15</td>
                                    </tr>
                                    <td>3</td>
                                    <td>바코드 인식이 안되면 어쩌죠?</td>
                                    <td>어쩔티비</td>
                                    <td>2023.02.8</td>
                                    </tr>
                                    <td>4</td>
                                    <td>매장에서 냄새나요</td>
                                    <td>페브리즈</td>
                                    <td>2023.02.10</td>
                                    </tr>
                                    <td>5</td>
                                    <td>모듈을 도둑맞았어요</td>
                                    <td>노진구</td>
                                    <td>2023.02.09</td>
                                    </tr>
                                    <td>6</td>
                                    <td>우리 아이가 모듈에 침을 흘렸는데</td>
                                    <td>구타 유발자</td>
                                    <td>2023.02.2</td>
                                    </tr>
                                    <tr>
                                    <td>7</td>
                                    <td>메인페이지가 너무 구려요</td>
                                    <td>백종원</td>
                                    <td>2023.02.01</td>
                                    </tr>
                                    <td>8</td>
                                    <td>아니 왜 QR을 인식을 못합니까?</td>
                                    <td>이재용</td>
                                    <td>2023.01.27</td>
                                    </tr>
                                    <td>9</td>
                                    <td>전 겔럭시 탭 쓰는데 모듈에 고정을 어떻게하죠?</td>
                                    <td>내사랑 아이폰</td>
                                    <td>2023.01.16</td>
                                    </tr>
                                    <td>10</td>
                                    <td>무듈에 카메라 있던데 우릴 감시하는건가요? 기분이 나쁘네요..</td>
                                    <td>현실부정자</td>
                                    <td>2023.02.02</td>
                                    </tr>
                                    <td>11</td>
                                    <td>인텐트필터 적용하는방법 알려주세요</td>
                                    <td>다이소</td>
                                    <td>2023.01.07</td>
                                    </tr>
                                    <tr>
                                    <td>12</td>
                                    <td>바코드 인식이 너무 느려요</td>
                                    <td>소녀시대</td>
                                    <td>2023.01.05</td>
                                    </tr>
                                    <td>13</td>
                                    <td>지갑을 카트에 두고왔는데 확인 가능하나요?</td>
                                    <td>개구리</td>
                                    <td>2023.01.01</td>
                                    </tr>
                                    <td>14</td>
                                    <td>카트 손잡이가 더러워요</td>
                                    <td>비염</td>
                                    <td>2022.12.27</td>
                                    </tr>
                                    <td>15</td>
                                    <td>카트 에 바퀴가 없는데 무슨 일이죠?</td>
                                    <td>백수</td>
                                    <td>2022.12.22</td>
                                    </tr>
                                       <!-- 작성날짜 색을 빨강 또는 주황으로 해결되지않았다는걸 알려주고 관리자가 해결후 버튼 클릭시 초록색으로 해결완료 표시 -->
                                    </tbody>
                                 </table>
                              
                        <!-- END TABBED CONTENT -->
                     </div>
                     <!-- END RIGHT COLUMN -->
                  </div>
               </div>
            </div>
         </div>
         <!-- END MAIN CONTENT -->
      </div>
      <!-- END MAIN -->
      <div class="clearfix"></div>
      <footer>
         <div class="container-fluid">
            <p class="copyright">Shared by <i class="fa fa-love"></i><a href="https://bootstrapthemes.co">BootstrapThemes</a>
</p>
         </div>
      </footer>
   </div>
   <!-- END WRAPPER -->
   <!-- Javascript -->
   <script src="assets/vendor/jquery/jquery.min.js"></script>
   <script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
   <script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
   <script src="assets/scripts/klorofil-common.js"></script>
</body>

</html>