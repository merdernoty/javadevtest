<!DOCTYPE html>
<html lang="en">
<head><title>
        DEMOBUYSELL
    </title>
    <head>
<body>
<h1>DEMOBUYSELL</h1>
<hr>
<h4>All products</h4>
<#list products as product>
    <div><p><b>${product.title},</b><span style="margin-left: 5px">${ product.price}</span> | <a href="/product/${product.id}">Details</a></p></div>
</#list>
<hr>
<h3>Create new item</h3>
<form action="/product/create" method="post">
    Title item: <input type="text" name="title" /><br>
    description: <input type="text" name="description" /><br>
    price: <input type="number" name="price" /><br>
    city: <input type="text" name="city" /><br>
    author: <input type="text" name="author" /><br>
    <input type="submit"  value="Create"/>
</form>
</body>
</html>