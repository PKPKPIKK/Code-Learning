package com.LT.Learning.LV1.variable;

public class variableDemo2 {
    public static void main(String[] args) {
        /*
        我方：叉子     对手:长剑
        攻击：321      攻击：365
        防御：98       防御：95
        血量：2365     血量：2489
        技能加成：1.2  技能加成：1.3
        技能造成伤害计算：攻击*技能加成-防御
        普通攻击造成伤害计算：攻击-防御

        计算：
        我方进行一次普通攻击，造成多少伤害，对方剩余血量？
        我方进行一次技能攻击，造成多少伤害，对方剩余血量？
         */
        //定义变量记录我方攻击力
        int myAttack = 321;
        //定义变量记录我方防御力
        int myDefense = 98;
        //定义变量记录我方技能加成
        double mySkillAdd = 1.2;
        //定义变量记录我方血量
        double myHp = 2365;
        //定义变量记录对方攻击力
        int enemyAttack = 365;
        //定义变量记录对方防御力
        int enemyDefense = 95;
        //定义变量记录对方技能加成
        double enemySkillAdd = 1.3;
        //定义变量记录对方血量
        double enemyHp = 2489;

        //我方进行一次普通攻击，造成多少伤害，对方剩余血量？
        double myAttackDamage = myAttack - enemyDefense;
        enemyHp = enemyHp - myAttackDamage;
        System.out.println("我方普通攻击造成伤害："+myAttackDamage+"，对方剩余血量："+enemyHp);
        //我方进行一次技能攻击，造成多少伤害，对方剩余血量？
        double mySkillDamage = myAttack * mySkillAdd - enemyDefense;
        enemyHp = enemyHp - mySkillDamage;
        System.out.println("我方技能攻击造成伤害："+mySkillDamage+"，对方剩余血量："+enemyHp);

    }

}
