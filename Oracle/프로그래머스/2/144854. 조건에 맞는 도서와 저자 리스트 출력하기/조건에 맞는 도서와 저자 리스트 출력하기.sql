-- 코드를 입력하세요
SELECT a.book_id AS book_id
     , b.author_name AS author_name
     , TO_CHAR(a.published_date, 'YYYY-MM-DD') AS published_date
FROM BOOK a, AUTHOR b
WHERE a.author_id = b.author_id
AND a.category = '경제'
ORDER BY a.published_date ASC;