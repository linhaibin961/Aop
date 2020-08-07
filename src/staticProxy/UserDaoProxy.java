package staticProxy;

public class UserDaoProxy implements IUserDao{

    private IUserDao target;
    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        //扩展了额外功能
        System.out.println("开启事务");
        target.save();
        System.out.println("提交事务");
    }
}