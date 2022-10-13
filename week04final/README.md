week 04 assignment

METHOD || URL || REQUEST || RESPONSE

<h2>User</h2>

POST || ("/signup") || SignupRequestDto || ResponseDto </br>
POST || ("/login") || loginRequestDto || ResponseEntity</br>
POST || ("reissue") || TokenRequestDto || ResponseEntity</br>

<h2>Post</h2>

POST || ("auth/posts") || PostRequestDto || ResponseDto</br>
GET || ("/posts") || "" || ResponseDto</br>
PUT || ("/auth/posts/{id}") || PostRequestDto || ResponseDto</br>
DELETE || ("/auth/posts/{id}") || Long id || ResponseDto</br>


<h2>Comment</h2>

POST || ("/auth/comments") || CommentRequestDto || ResponseDto</br>
GET || ("/comments/{id}") || Long id || ResponseDto</br>
PUT || ("/auth/comments/{id}") || Long id || ResponseDto</br>
DELETE || ("/auth/comments/{id}") || Long id || ResponseDto</br>
