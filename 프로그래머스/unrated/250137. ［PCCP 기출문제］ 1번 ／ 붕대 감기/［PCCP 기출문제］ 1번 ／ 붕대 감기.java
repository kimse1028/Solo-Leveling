class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int hp = health;
        int t = 0;
        int y = 0;
        
        
        
        //attacks에는 attackTime, damage 가 있음.
        //i 가 attackTime이 되면 damage가 들어가는 쪽으로 구현.
        //큰 포문 붕대 i 가 시간이 되고 if문으로 i가 attackTime과 일치하면 
        //i는 attacks[0]의 마지막 거시기가 최고값 (최종 시간)
        //damage 구현하고 지금까지 쌓았던 t초 결산 붕대 취소
        //bandage[0] 얘는 t % bandage[0] == 0 일때, bandage[2] 회복. t = 0 초기화
        //bandage[1] 얘는 초당 회복량임. 얘는 계속 회복해야함. 얘가 그냥 회복맨 t++ 해줌
        
        
        for(int i = 0; i <= attacks[attacks.length-1][0]; i++) {
            if(i == attacks[t][0]) {
                y = 0;
                hp -= attacks[t][1];
                t++;
                if(hp <= 0) {
                    return -1;
                }
            } else {
                if(hp <= 0) {
                    return -1;
                }
                hp += bandage[1];
                y++;
                if(y % bandage[0] == 0) {
                    hp += bandage[2];
                    y = 0;
                }
                if(hp > health) {
                    hp = health;
                }
            }
        }        
        return hp;
    }
}