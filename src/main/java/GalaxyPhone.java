public class GalaxyPhone implements Phone {

    //  GalaxyPhone 클래스의 멤버변수로 GalaxyWatch를 추가 하기.
    private GalaxyWatch galaxyWatch;

    @Override
    public void powerOn() {
        System.out.println("갤럭시폰 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("갤럭시폰 전원 OFF");
    }

    @Override
    public void volumeUp() {    //  갤럭시워치로 폰 음량 ++
//        galaxyWatch = new GalaxyWatch();
        galaxyWatch.volumeUp();
    }

    @Override
    public void volumeDown() {  //  갤럭시워치로 폰 음량 --
//        galaxyWatch = new GalaxyWatch();
        galaxyWatch.volumeDown();
    }

    //  위와 같이 코드에 직접적으로 new를 사용 하는 것은 코드의 결합도가 올라 가고, 유지 보수에 불리하다.

    //  이렇게 갤럭시폰의 음량을 높히거나 또는 낮추기 위해서,
    //  갤럭시워치를 객체화 (new) 해야 하는 관계를 의존 관계 라고 부른다.
    //  매번 new 키워드를 사용 해서 객체화를 해줄 수 없기에,
    //  .xml 설정 파일을 생성 해서 이 문제를 해결 할 수 있다.

}   //  GalaxyPhone