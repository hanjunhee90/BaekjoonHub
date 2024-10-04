-- 코드를 입력하세요
SELECT a.title        AS title
     , a.board_id     AS board_id
     , b.reply_id     AS reply_id
     , b.writer_id    AS writer_id
     , b.contents     AS contents
     , TO_CHAR(b.created_date, 'YYYY-MM-DD') AS created_date
FROM USED_GOODS_BOARD a, USED_GOODS_REPLY b
WHERE TO_CHAR(a.created_date, 'YYYYMM') LIKE '202210%'
AND a.board_id = b.board_id
ORDER BY created_date, title;