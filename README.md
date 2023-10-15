# RecipeBook
여러 음식의 레시피를 소개해주고, 맛집을 추천해주는 프로그램
 <br>
 

## 📌 프로젝트 소개
Java 학습을 위하여 만든 프로그램입니다.
<br>
 

## 📌 주요 기능
#### 1. 원하는 음식 메뉴를 선택하면 레시피 정보를 제공합니다.
   <img width="333" alt="image" src="https://github.com/Annjieun/RecipeBook/assets/87294962/54bdb7f6-c981-43f2-bc79-2a0be1147f68">
   <img width="384" alt="image" src="https://github.com/Annjieun/RecipeBook/assets/87294962/caa12a06-e583-422c-b4c5-66bf20a0718c">
   <img width="385" alt="image" src="https://github.com/Annjieun/RecipeBook/assets/87294962/bfda6bcd-1856-4986-8946-92870b96d4fd">
   <img width="395" alt="image" src="https://github.com/Annjieun/RecipeBook/assets/87294962/3a514c47-6cd5-4168-8c0d-23b0b3749f34">

#### 2. 하단의 추천 버튼을 눌러 메뉴를 입력하면 맛집을 추천해줍니다.
   <img width="345" alt="image" src="https://github.com/Annjieun/RecipeBook/assets/87294962/fb27c555-0e09-46fe-8455-893f6b15ffeb">
   <img width="346" alt="image" src="https://github.com/Annjieun/RecipeBook/assets/87294962/6f62cb5d-8dfe-4b52-9c37-899b266c9784">
   <img width="382" alt="image" src="https://github.com/Annjieun/RecipeBook/assets/87294962/c5444978-1eac-4504-957a-6e553cc1544b">

<br>


### 🛠️ 클래스 설계
```bash
📦src
 ┣ 📂Action
 ┃ ┗ 📜PageMove.java
 ┣ 📂Button
 ┃ ┣ 📜CfoodItem.java
 ┃ ┣ 📜ItemButton.java
 ┃ ┣ 📜JfoodItem.java
 ┃ ┣ 📜KfoodItem.java
 ┃ ┣ 📜MenuButton.java
 ┃ ┗ 📜WfoodItem.java
 ┣ 📂Data
 ┃ ┗ 📜RecipeData.java
 ┗ 📂Main
 ┃ ┗ 📜Recipe_Main.java
```
#### Action
- PageMove.java : 아이템(메뉴)들이 많을 경우 위 아래 방향키를 이용해 화면 이동하도록 구현
#### Button
- ItemButton.java : 각각의 아이템(메뉴)의 버튼을 디자인한다.
- MenuButton.java : 카테고리의 메뉴 버튼을 디자인한다.
- KfoodItem.java, JfoodItem.java, CfoodItem.java, WfoodItem.java : 카테고리의 아이템들을 Package Button.ItemButton을 이용하여 버튼으로 생성한다. 또한 각 아이템을 누를 때마다 레시피가 나오도록 액션리스너를 등록한다.
#### Data
- RecipeData.java : 각각의 아이템마다 해당 레시피를 같이 저장한다.
#### Main
- RecipeMain.java : 전체적인 메인화면 구성을 담당한다. 제목과 레시피 패널을 생성하며 Package Button.MenuButton을 이용해 카테고리 버튼 생성 및 Package Button.KfoodItem/JfoodItem/CfoodItem/WfoodItem을 이용해 각 아이템들을 생성하고 아이템 패널에 부착한다. 생성한 아이템들을 화면에 출력하도록 한다. 또한 카테고리 선택 시 해당 메뉴들을 보여주는 액션 리스너를 등록한다.

