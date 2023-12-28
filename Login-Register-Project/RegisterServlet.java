protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        String username = request.getParameter("username");
		        String password = request.getParameter("password");
		        String email = request.getParameter("email");

		        User user = new User();
		        user.setUsername(username);
		        user.setEmail(email);
		        user.setPassword(password);

		        //UserDao userDao = new UserDaoImpl();
		        if (userDao.addUser(user)) {
		            response.sendRedirect("login.jsp?registration=success");
		        } else {
		            response.sendRedirect("register.jsp?error=1");
		        }
		    }