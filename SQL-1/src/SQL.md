1 - film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

<h3> SELECT title,description FROM film ; </h3>

![](1.png)

------------
2 - film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.

 <h3>SELECT title,length FROM film <br>
 WHERE length>60 AND length <75; <h3>  



![](2.png)

-------------

3 - film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.

<h3>SELECT title,rental_rate,replacement_cost FROM film <br>
WHERE rental_rate = 0.99 AND(replacement_cost = 12.99 OR replacement_cost = 28.99) ;
</h3>

![](3.png)

--------------

4 - customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?

<h3>
SELECT * FROM customer <br>
WHERE first_name = 'Mary';
</h3>

![](4.png)


--------

5 - film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.

<h3>SELECT title,rental_rate,length FROM film <br>
WHERE length<=50 AND NOT (rental_rate =2.99 OR rental_rate=4.99);
</h3>

![](5.png)