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


1. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
    @RequstBody 에 id 를 넘겨줘서 했습니다. 

2. 어떤 상황에 어떤 방식의 request를 써야하나요?
    list 를 가져올떈 "GET"
    수정 할땐 "PUT"
    삭제 할떈 "DELETE"
    생성 할땐 "POST"

3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?
    그런것 같습니다. api 를 보면 무슨 request 를 보내는지 알수있습니다.

4. 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)
    네.

5. 작성한 코드에서 빈(Bean)을 모두 찾아보세요!
    Controller package * , Repository package * , Service package *

6. API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!
