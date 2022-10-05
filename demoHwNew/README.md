API Receipt

METHOD / URL / REQUEST / RESPONSE


"GET" | /api/posts | - |   

{
"createdAt": "2022-10-05T12:30:08.782367",
"modifiedAt": "2022-10-05T12:30:08.782367",
"id": 3,
"name": "the test",
"content": "new content",
"email": "fdsdkj@gmail.com",
"password": "1234"
}

"POST" | /api/posts | 	
{
"name" : "new post",
"content" : "new content",
"email" : "new@gmail.com",
"password" : "1234"
}

{
"createdAt": "2022-10-05T12:36:03.983831",
"modifiedAt": "2022-10-05T12:36:03.983831",
"id": 4,
"name": "new post",
"content": "new content",
"email": "new@gmail.com",
"password": "1234"
}

"GET" | /api/posts/{id} | id
{
"createdAt": "2022-10-05T13:55:34.513691",
"modifiedAt": "2022-10-05T13:55:34.513691",
"id": 1,
"name": "adam",
"title": "title",
"content": "testing content",
"email": "adam@gmail.com",
"password": "1234"
}



"PUT" | /api/posts/{id} | 
{
"name" : "changed name",
"content" : "changed content",
"email" : "changed@gmail.com",
"password" : "1234"
}

(if the password is correct )

returns id of the changed post

(if the password is incorrect) 
throws new error.

"DELETE" | /api/posts/{id} | id

returns id of the deleted post



