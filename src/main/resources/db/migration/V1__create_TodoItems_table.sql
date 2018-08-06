CREATE TABLE memos
(
  id serial NOT NULL,
  title text,
  body text,
  created_at datetime,
  updated_at datetime,
  CONSTRAINT slides_pkey PRIMARY KEY (id)
)