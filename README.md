# FastCampusStudy-2

## 2023-03-13 ~ 2023-03-19

### 웹툰앱 (chapter1)
1. 구현기능
 - WebView
 - ViewPager2
 - Fragment
 - SharedPreference
 - Dialog
- 4대 컴포넌트
 - Activity
 - Service
 - BroadCast Receiver
 - Content Provider
 
2. 몰랐던 점
 - webView.settings.javaScriptEnabled = true // javascript in webView
 - Fragment	
	- OnCreateView -> View 가 생성되는 곳
	- 생명주기 Study
	- transaction() -> 하나의 작업 단위
 - Fragment는 Activity를 하나는 가지고 있음
 - commit과 apply의 차이
	- commit은 동기 처리(바로 값이 필요한 경우, 하던 것 멈추고 이것부터 해!), apply는 비동기 처리 (뒤에서 알아서 처리하겠지)

======================================================

### 녹음앱 (chapter2)
1. 구현기능
 - MediaPlayer
 - MediaRecorder
 - Permission Request
 - Canvas
 - Handler
	- UI Thread와 협업(Timer와 같이 사용)

======================================================

### 뉴스앱 (chapter6)
1. 구현 기능
 - Retrofit
  - Ticxml (XML Parser과 함께 Parsing 할 수 있는 라이브러리)
 - Material Design
 - Jsoup (Java Html parser)
  - 크롤링
 - Glide
 - Lottie
  - animation(json file 형식)
2. 몰랐던 것
 - ConstraintLayout
	- dimensionRatio를 사용하면 비율로 화면을 정할 수 있음
 - forEachIndexed
 - Lottie는 animation을 쉽게 만들어 줄 수 있음.
 - raw에 animation 파일을 넣으면 됨
 
 ===========================================================

### 채팅앱 (chapter6)
1. 구현기능
 - Firebase Realtime Database
 - Firebase Authentication
 - Firebase Cloude Message (일명 FCM)
2. 몰랐던 것
 - compileSdk는 현재 내가 사용할 수 있는 API로 컴파일 하겠다.
 - targetSdk는 내가 어떤 SDK로 컴파일 했다. (ex - 33으로 내가 테스트를 해보았다.)

==============================================================

### 날씨앱 (chapter7)
1. 구현 기능
 - Location
 - Foreground Service(Background는 무시되거나 배터리 제약)
 - Android Widget
 - 공공데이터포털
2. 몰랐던 것
 - 안드로이드 보안이 높아져 권한 목록 추가(대략적인 위치, 정확한 위치)
 - Background 위치 권한 (widget에 사용)
 - Fused Location Previder API를 사용하면 좀 더 쉽게 Location을 가지고 올 수 있음.
 - Https를 사용하려면 따로 Manifest에서 권한을 설정해야함.
 - 앱 widget을 업데이트하기 위해 onUpdate()를 호출한다
 - 홈 화면에 widget을 넣으면 onUpdate() 함수가 호출 됨
 - Repository -> 데이터 저장소 / 데이터를 가져오는 클래스 파일을 뜻함.
 
=============================================================

 ### 대동맛집도 (chapter8)
 1. 구현기능
  - navermap
  - naver open api
  - bottomSheetBehavior
	- Bottom Sheets
  - moshi
	- gson은 google api, moshi는 retrofit을 만든 square api이다.
 2. 몰랐던 것
  - ccoordinatorLayout
	- FrameLayout 기반의 강력한 상호작용 레이아웃
	
================================================================
