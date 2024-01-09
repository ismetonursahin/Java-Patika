1 - film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.

  <h2> SELECT DISTINCT replacement_cost FROM film ; </h2>

![img.png](img.png)

-----------------------
2 - film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?

 <H2> SELECT COUNT (DISTINCT replacement_cost) FROM film ; </H2>

![img_1.png](img_1.png)

----------------------

3 - film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?


<H2>SELECT COUNT(*) FROM film <BR>
WHERE title  LIKE 'T%' AND rating ='G';
</H2>

![img_2.png](img_2.png)

---------------------

4 - country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?

<H2> SELECT COUNT(*) FROM country <BR>
WHERE country  LIKE '_____' ; </H2>

![img_3.png](img_3.png)

--------------------------

5 - city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?

<h2> SELECT city FROM city  <br>
WHERE city  ILIKE 'r%r' ; </h2>

![img_4.png](img_4.png)
