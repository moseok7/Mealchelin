# 📚ProJect - Mealchelin

<!-- contents -->
<details open="open">
  <summary>Contents</summary>
  <ol>
    <li>
      <a href="#개요">개요</a>
    </li>
    <li>
      <a href="#내용">내용</a>
    </li>
    <li>
      <a href="#화면-설계-요약">화면 설계 요약</a>
    </li>
    <li>
      <a href="#담당-구현-기능">담당 구현 기능</a>
    </li>
  </ol>
</details>

------------

# 📝개요

* 프로젝트 명 : Mealchelin

* 일정 : 2021년 04월 18일 ~ 2021년 08월 31일(실 개발기간 1달)

* 개발 목적 : 코로나 이후 성장하고 있는 밀키트 시장을 겨냥하여, 소비자가 원하는 밀키트를 선택하여 주문할 수 있는 쇼핑몰 사이트 구축

* 개발 환경 :
  * O/S : Window 10
  * Java EE IDE : Eclipse
  * Front-End : HTML, CSS, JS
  * Back-End : Java, Jsp, Spring, Apache Tomcat v9.0
  * Database : Oracle
  * Version management : Git 
  
* 개발 후기 : 실무 프로젝트에 대비하여 팀 프로젝트를 진행하면서 프로그래밍 능령 향상 및 커뮤니케이션 능력과 팀워크 향상되었습니다.

------------

# 📝내용

* 전체 구현 기능
  * 회원 관리 :  가입, 로그인, 비밀번호 찾기, 정보수정, 탈퇴, 마이페이지
  * 상품 관리 : 상품리스트(전체/분류), 상품 상세화면, 검색, 등록, 수정, 삭제
  * 주문 관리 : 장바구니/주문의 등록/조회/수정/삭제, 주문상태 변경
  * 게시글 관리 : 리뷰 , 커뮤니티 게시판의 등록/조회/수정/삭제
  * 관리자 기능 
  
* 담당 구현 기능
  * 커뮤니티 게시판의 조회, 등록, 수정, 삭제
  * 게시판 파일 업로드 기능
  * 게시판 페이징 처리
  * 게시판 검색 기능
  * 관리자 페이지
 
* DB 설계<br>
![ERD](https://user-images.githubusercontent.com/102956465/200527965-3cc50180-2413-4e0a-8dc8-5f3929a01fe9.jpeg)

------------

# 📝화면 설계 요약

## 파트별 핵심 화면
  
#### 1. 메인 화면

<img src="https://user-images.githubusercontent.com/102956465/200544341-c05c827a-7c65-4daa-96c2-e4360649ae50.JPG" width="700"> 

#### 2. 회원 화면

<img src="https://user-images.githubusercontent.com/102956465/200538435-d0175fcc-d3d0-410f-bf54-03496d9bdbd3.JPG" width="700"> 

#### 3. 상품 화면

<img src="https://user-images.githubusercontent.com/102956465/200538591-7154c799-6b2f-4481-80bf-f9e7db7b60e5.JPG" width="700"> 

#### 4. 주문 화면

<img src="https://user-images.githubusercontent.com/102956465/200538677-1e89bdf5-694e-4c04-95f6-cb6df59756cc.JPG" width="700"> 

#### 5. 게시판 화면

<img src="https://user-images.githubusercontent.com/102956465/200544406-39bd5780-c63c-4ccf-a3f8-920149e06f37.JPG" width="700"> 

------------

# 📝담당 구현 기능

## 커뮤니티 게시판

<h3>게시판 조회</h3>

<img src="https://user-images.githubusercontent.com/102956465/200544406-39bd5780-c63c-4ccf-a3f8-920149e06f37.JPG" width="700"> 

**사이트 내 게시판 페이지**
   
* 구현 기능 설명
  * 게시판 글 목록 조회
  * 게시글 글 쓰기 가능
  * 페이징을 통해 게시글 목록 넘기기
  * 게시글 클릭시 상세보기 페이지 이동
  * 게시글 검색 기능(제목, 내용, 작성자, 제목+내용)

------------

<h3>게시글 작성</h3>

<img src="https://user-images.githubusercontent.com/102956465/201022195-fa6f7299-b47f-495c-ae8d-f5fb8610e14a.PNG" width="700">

**게시판 글 작성 페이지**
  
* 구현 기능 설명
  * 파일 첨부 기능
  * 등록 클릭 시, 해당 내용으로 DB에 등록

------------

<h3>게시글 상세보기, 삭제</h3>
  
<img src="https://user-images.githubusercontent.com/102956465/201039276-31c14928-1494-4de8-a0b8-4475cc4e6862.PNG" width="700"> 

**작성한 글을 삭제하고 싶은 경우 게시글을 삭제**

* 구현 기능 설명
  * 게시글 클릭시 상세보기 페이지 이동
  * 작성자, 제목, 내용, 첨부된 파일 확인가능
  * 게시글 수정 버튼 클릭 시 페이지 이동 가능
  * 게시글 삭제 버튼 클릭 시 글 삭제
  * 게시글 목록으로 돌아가기 가능
   
------------  

<h3>게시글 수정</h3>

<img src="https://user-images.githubusercontent.com/102956465/201024908-f786678c-dad1-4440-955f-71fbbe3604da.PNG" width="700"> 
 
**게시판 글 수정 페이지**

* 구현 기능 설명
  * 게시글 수정 시, DB에 등록된 게시글 제목, 내용 불러옴
  * 파일이 등록된 게시글의 경우, 파일도 함께 수정 및 삭제 가능
  * 등록 클릭 시, 해당 내용으로 DB에 등록

------------

  <h3>게시판 관리자</h3>

  **1:1문의 게시판 조회 - 일반 회원**

  * 구현 기능 설명
   - 회원 개인마다 자신이 남긴 1:1 문의만 조회 가능.
   - 관리자의 답변이 달린 경우 답변 여부의 이미지가 바뀜
   - 글 클릭 시, 해당 문의 사항 상세 조회로 넘어감.
   - 삭제처리된 게시글을 전체 조회 가능
   - 게시판 별로 조회 가능함.
   - 선택한 게시글만 복구처리 가능
   - 클릭 시 어떤 게시글인지 조회 가능
   - 페이징 처리
	 
------------
    
<p align="center">
지금까지 읽어주셔서 감사합니다:)<br><br>
수정중
</p>
