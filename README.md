

# 그래픽
## 그래픽 기반 GUI 프로그래밍
스윙 컴포넌트를 사용하지 않고 이미지를 직접 그려 GUI 화면을 구성
다양한 모양을 만들 수 있고, 스윙보다 빠르다.

##Graphics
클래스 경로명 : java.awt.Graphics

    Graphics g;

### 문자열 그리기

    g.drawString(String str, int x, int y);    // str 문자열을 (x,y)영역에 그린다.

### COLOR

        g.setColor(new Color(255,0,0));            // 빨간색을 생성하여 그래픽 색으로 지정한다. 
        g.setColor(new Color(0x0000ff00));        // 초록색을 생성하여 그래픽 색으로 지정한다. 
        g.setColor(Color.YELLOW);                 // 노란색을 그래픽 색으로 지정한다.
    
### Font

    Font f = new Font("Times New Romen", Font.ITALIC,30);   // ITALIC 스타일을 가진 "Time New Roman"체로서 30픽셀 크기의 폰트
    g.setFont(f);
    g.setColor(Color.RED);
    g.drawString("How much",30,30);
    
### 도형그리기

    

## PaintComponent()
JComponent의 추상 메소드로 모든 스윙 컴포넌트가 오버라이딩하여 가지고 있다.
    
  void paintComponent(Graphics g) // 스윙 컴포넌트가 자신의 내부 모양을 그린다.
  
### JPanel에 그리기

          class MyPanel extends JPanel{
            @Override
            public void paintComponent(Graphics g) {
              super.paintComponent(g);	//JPanel에 구현된 paintComponent() 호출
              g.setColor(Color.BLUE);	
              g.drawRect(10,10,50,50);
              g.drawRect(50,50,50,50);
              g.drawRect(90,90,50,50);
            }
         }
