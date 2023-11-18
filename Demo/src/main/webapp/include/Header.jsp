<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Start your development with Creative Design landing page.">
    <meta name="author" content="Devcrud">
    
    <%
    if(request.getAttribute("title") == null){
    	out.print("<title>Homepage</title> ");
    }else{
    	out.print("<title>" + request.getAttribute("title") + "</title>");
    }
    
    %>
    

    <!-- font icons -->
    <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">

    <!-- Bootstrap + Creative Design main styles -->
	<link rel="stylesheet" href="assets/css/creative-design.css">

</head>
<body data-spy="scroll" data-target=".navbar" data-offset="40" id="home">
    
    <!-- Page Navbar -->
    <nav id="scrollspy" class="navbar page-navbar navbar-light navbar-expand-md fixed-top" data-spy="affix" data-offset-top="20">
        <div class="container">
            <a class="navbar-brand" href="#"><strong class="text-primary">Dev </strong> <span class="text-dark">Portfolio</span></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/Home?page=home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/Site?page=listusers">Projects</a>
                    </li>
                      <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/Site?page=addusers">Add Projects</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#features">Hire me!!!</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#testmonial">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contact">Contact</a>
                    </li>
                    <li class="nav-item ml-md-4">
                        <a class="nav-link btn btn-primary" href="components.html">Explore Now</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav><!-- End of Page Navbar -->   

    <!-- Page Header -->
    <header id="home" class="header">
        <div class="overlay"></div>
        <div class="header-content">
            <p>  Mustapha Bello Abubakar (ABM)</p>
            <h6>I am a Software Engineer</h6> 
            <button class="btn btn-outline-light">View Projects</button> 
        </div>      
    </header><!-- End of Page Header -->    
    
    <!-- About Section -->
    <section id="about">
        <!-- Container -->
        <div class="container">
            <!-- About wrapper -->
            <div class="about-wrapper">