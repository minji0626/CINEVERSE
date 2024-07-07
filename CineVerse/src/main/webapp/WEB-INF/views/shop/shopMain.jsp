<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- 벌스샵 시작 -->
<div class="shop-main">
	<form action="shopSearch" id="shop_search">
		<ul>
		<label>
			<input type="search" name="search" placeholder="검색어를 입력하세요">
			<input type="submit" value="" style="background-image: url('${pageContext.request.contextPath}/images/search_icon.png');">
		<label>
			</ul>
		<div class="select-wrapper">
		<select name="shopOrder" id="shopOrder">
			<option value="1" <c:if test="${param.order == 1 }">selected</c:if>>최신순</option>
			<option value="2" <c:if test="${param.order == 2 }">selected</c:if>>구매순</option>
			<option value="3" <c:if test="${param.order == 3 }">selected</c:if>>후기순</option>
			<option value="4" <c:if test="${param.order == 4 }">selected</c:if>>평점순</option>
			<option value="5" <c:if test="${param.order == 5 }">selected</c:if>>관심상품순</option>
		</select>	
		</div>
	</form>
</div>
<!-- 벌스샵 끝-->