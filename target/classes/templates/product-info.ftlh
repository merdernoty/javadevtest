<!DOCTYPE html>
<html lang="en">
<head><title>
        DEMOBUYSELL
    </title>
    <head>
<body>
<h1>DEMOBUYSELL</h1>
<hr>
<h4>Item details</h4>
<b>Title : </b>${product.title}<br>
<b>Description : </b>${product.description}<br>
<b>Price : </b>${product.price}<br>
<b>City : </b>${product.city}<br>
<b>author : </b>${product.author}<br>
<hr>
<h3>Create new item</h3>
<form action="/product/delete?${product.id}"> method="post">
    <input type="submit"  value="Delete"/>
</form>
</body>
</html>