week 04 assignment

METHOD || URL || REQUEST || RESPONSE

<h2>User</h2>

POST || ("/signup") || SignupRequestDto || ResponseDto
POST || ("/login") || loginRequestDto || ResponseEntity
POST || ("reissue") || TokenRequestDto || ResponseEntity

<h2>Post</h2>

POST || ("auth/posts") || PostRequestDto || ResponseDto
GET || ("/posts") || "" || ResponseDto
PUT || ("/auth/posts/{id}") || PostRequestDto || ResponseDto
DELETE || ("/auth/posts/{id}") || Long id || ResponseDto


<h2>Comment</h2>

POST || ("/auth/comments") || CommentRequestDto || ResponseDto
GET || ("/comments/{id}") || Long id || ResponseDto
PUT || ("/auth/comments/{id}") || Long id || ResponseDto
DELETE || ("/auth/comments/{id}") || Long id || ResponseDto
