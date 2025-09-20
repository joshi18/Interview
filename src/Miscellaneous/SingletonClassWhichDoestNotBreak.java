//package src.Miscellaneous;
//
//public class SingletonClassWhichDoestNotBreak implements Cloneable{
//
//
//    private  static  volatile SingletonClassWhichDoestNotBreak singletonClassWhichDoestNotBreakInstance;
//
//    private SingletonClassWhichDoestNotBreak(){
//        if (singletonClassWhichDoestNotBreakInstance != null){
//            throw new RuntimeException("Singleton has allready be created");
//        }
//    }
//
//    protected Object readResolve(){
//        return getInstance();
//    }
//
//
////    @Override
////    protected Object clone() throws ClassNotFoundException{
////        throw new RuntimeException("this can be possible here ");
////
////    }
//
//    public static  SingletonClassWhichDoestNotBreak getInstance(){
//        if (singletonClassWhichDoestNotBreakInstance == null){
//            synchronized (SingletonClassWhichDoestNotBreak.class){
//                {
//                    singletonClassWhichDoestNotBreakInstance = new SingletonClassWhichDoestNotBreak();
//                }
//                return singletonClassWhichDoestNotBreakInstance;
//            }
//        }
//        return singletonClassWhichDoestNotBreakInstance;
//
//    }
//
//
//
//
//
//
//}
