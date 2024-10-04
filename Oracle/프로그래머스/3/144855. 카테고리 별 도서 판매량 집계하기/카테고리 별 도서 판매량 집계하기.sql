-- 코드를 입력하세요
SELECT a.category   AS CATEGORY
     , SUM(sales) AS TOTAL_SALES
FROM BOOK a, BOOK_SALES b
WHERE a.book_id = b.book_id
AND TO_CHAR(b.sales_date, 'YYYY-MM') LIKE '2022-01%'
GROUP BY a.category
ORDER BY a.category ASC;