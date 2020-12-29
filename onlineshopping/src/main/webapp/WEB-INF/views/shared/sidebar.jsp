<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      <div class="col-lg-3">

        <h5 class="my-4">shop by department</h5>
        <div class="card">
         <c:forEach items="${categories}" var="category">
             <a href="#" class="ml-2">${category.name}</a>
         </c:forEach>
        </div>

      </div>