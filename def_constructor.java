class Geek{
  String name;
  int id;

  Geek(String name, int id){
    this.name=name;
    this.id=id;
  } 
}
class def_constructor{
  public static void main(String[] args){
    Geek geek1=new Geek("Simar", 4);
    System.out.println("Geek name"+ geek1.name + "and geek id" + geek1.id);
  }
}
