# Servlet_3

# 기능

#### 
### Notice
-공지사항(Notice) 게시판
- 글쓰기, 수정, 삭제는 id가 admin만 가능
- 글리스트페이지 최신순으로 출력
- 리스트 페이지에서 글쓰기 버튼 클릭하면 글쓰기로 이동
- 리스트 페이지에서 글제목을 누르면 글 상세보기로 이동
- 글 상세보기에서 글수정, 글삭제 버튼 존재 (로그인해서 들어가면 에러 안뜸)
- 글 삭제버튼을 누르면 확인, 취소 창을 띄우고 확인을 누르면 삭제
- 글 수정은 글수정으로 이동
- 글쓰기, 글수정, 글삭제 버튼은 admin에게만 보임

### Notice
- Notice list 출력
- Notice 등록
- Notice 상세 정보 출력 
- Notice 수정
- Notice 삭제

# JSP
- noticeList.jsp		: List 출력
- noticeAdd.jsp			: 입력 form
- noticeSelect.jsp		: notice 상세정보 출력
- noticeMod.jsp			: notice 수정

## URL 주소	/	JSP	/ Method
### /WEB-INF/views/notice/**
- /notice/noticeList	/ noticeList.jsp	  /	GET
- /notice/noticeAdd	/ noticeAdd.jsp	  /	GET 
- /notice/noticeAdd	/ 				  /	POST
- /notice/noticeSelect/ noticeSelect.jsp / GET
- /notice/noticeMod	/ noticeMod.jsp 	  / GET
- /notice/noticeMod	/				  / POST
- /notice/noticeDelete/				  / GET


### Member
- 회원가입		(Insert)
- 로그인		(Select One)
- 회원 정보 수정 	(Update)
- 회원 탈퇴		(Delete)
- myPage

## JSP
- /WEB-INF/views/member/...

##URL
- /member/memberJoin	memberJoin.jsp		GET
- /member/memberJoin 						POST
- /member/memberLogin	memberLogin.jsp		GET
- /member/memberLogin						POST
- /member/memberPage	memberPage.jsp		GET
- /member/memberUpdate	memberUpdate.jsp	GET
- /member/memberUpdate						POST
- /member/memberDelete						GET


### Point
- point list 출력
- point 등록
- point 상세 정보 출력 
- point 수정
- point 삭제

# JSP
- pointList.jsp		: List 출력
- pointAdd.jsp		: 입력 form
- pointSelect.jsp	: point 상세정보 출력
- pointMod.jsp		: point 수정

## URL 주소	/	JSP	/ Method
### /WEB-INF/views/point/**
- /point/pointList	/ pointList.jsp	  /	GET
- /point/pointAdd	/ pointAdd.jsp	  /	GET 
- /point/pointAdd	/ 				  /	POST
- /point/pointSelect/ pointSelect.jsp / GET
- /point/pointMod	/ pointMod.jsp 	  / GET
- /point/pointMod	/				  / POST
- /point/pointDelete/				  / GET


# ADD HOME1

