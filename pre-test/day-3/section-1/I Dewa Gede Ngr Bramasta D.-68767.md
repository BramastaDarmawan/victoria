#### Pilihan Ganda / True or False
1. A
2. B
3. B
4. True
5. B
6. B
7. False
8. C
9. C
10. D
11. B
12. True
13. C
14. B
15. A
16. True
17. C
18. D
19. False
20. A
21. B
22. B
23. D
24. A
25. True
26. A
27. C
28. SELECT *
FROM Customers;
29. B
30. C

#### Story Question
1. SELECT 
    books.title, 
    authors.name AS author_name, 
    genres.genre_name
FROM books
JOIN authors ON books.author_id = authors.id
JOIN genres ON books.genre_id = genres.id
WHERE genres.genre_name IN ('Mystery', 'Thriller');

2. SELECT
    borrowers.name,
    COUNT(borrowed_books.book_id) as count_books_borrowed
FROM borrowers
JOIN borrowed_books
GROUP BY borrowers.name
HAVING count_books_borrowed > 5;

3. SELECT
    books.title as title,
    COUNT(borrowed_books.book_id) as count_books_borrowed
FROM books
JOIN borrowed_books
GROUP BY books.title
HAVING count_books_borrowed;

4. Tidak tahu
5. Tidak tahu
6. Tidak tahu
7. Tidak tahu
8. Tidak tahu
