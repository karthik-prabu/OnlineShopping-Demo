<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>Ingredients page</h1>

<ul>
<c:forEach items="${ShopItems}" var="ShopItem">
   <li>${ShopItem}</li>
</c:forEach>
</ul>