package Baekjoon.baekjoon_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_2217 {
    /**
     * 문제
     * N(1 ≤ N ≤ 100,000)개의 로프가 있다. 이 로프를 이용하여 이런 저런 물체를 들어올릴 수 있다. 각각의 로프는 그 굵기나 길이가 다르기 때문에 들 수 있는 물체의 중량이 서로 다를 수도 있다.
     *
     * 하지만 여러 개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있다. k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 각각의 로프에는 모두 고르게 w/k 만큼의 중량이 걸리게 된다.
     *
     * 각 로프들에 대한 정보가 주어졌을 때, 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량을 구해내는 프로그램을 작성하시오. 모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다.
     *
     * 입력
     * 첫째 줄에 정수 N이 주어진다. 다음 N개의 줄에는 각 로프가 버틸 수 있는 최대 중량이 주어진다. 이 값은 10,000을 넘지 않는 자연수이다.
     *
     * 출력
     * 첫째 줄에 답을 출력한다.
     *
     * 2
     * 10
     * 15
     *
     * -> 20 답
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> weights = new ArrayList<>();

        int ropes = sc.nextInt();

        int totalWeight = 0;
        int totalWeight1;
        int totalWeight2;

        for (int i = 0; i < ropes; i++) {
            weights.add(sc.nextInt());
        }
        Collections.sort(weights);
        for (int i = 1; i < ropes; i++) {
            totalWeight1 = weights.get(i - 1) * (ropes - i + 1);
            totalWeight2 = weights.get(i) * (ropes - i);

            if (totalWeight1 > totalWeight) {
                totalWeight = totalWeight1;
            }
            if (totalWeight2 > totalWeight) {
                totalWeight = totalWeight2;
            }
        }

        if (ropes == 1)
            totalWeight = weights.get(0);

        System.out.println(totalWeight);
        /**
         * 가장 작은 값 * 전체 개수 > 제일 큰 값
         *
         * 1
         * 30
         * 50
         * 60
         *
         * = 100
         * 
         * (전체 개수 - 본인 인덱스) * 본인 무게 > 다음것의 계산 = 이전이 가장 큰 값
         */
    }
}
