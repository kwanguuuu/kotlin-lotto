# kotlin-lotto

## 1단계 프로그래밍 요구사항

- 인덴트 depth를 2를 넘지 않도록 구현한다. 1까지만 허용
- 함수의 길이가 10 라인을 넘어가지 않도록 구현한다

## 1단계 - 문자열 덧셈 계산기

### 기능 요구사항

- 쉼표 또는 콜론을 구분자로 가지는 문자열을 전달하는 경우, 구분자 기준으로 분리한 각 숫자의 합을 반환한다
- 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 "//"와 "\n"사이에 위치한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException을 던진다.

### 기능 명세서

- 문자를 숫자로 반환한다
    - [x] 입력받은 문자가 양수면 숫자로 처리한다
    - [x] null, 공백을 입력 받으면 0으로 반환한다
- 익셉션 처리 기능
    - [ ] 숫자가 아닌 경우 RunTimeException을 전달한다
    - [ ] 음수를 찾는 경우 RunTimeException을 전달한다
- 구분자로 문자열을 나눈다
    - [ ] 쉼표 구분자로 숫자 문자열을 나눈다
    - [ ] 콜론 구분자로 숫자 문자열을 나눈다
    - [ ] 쉼표 또는 콜론 구분자로 문자열을 나눈다
    - [ ] 커스텀 구분자를 지정한다
    - [ ] 문자열에 커스텀 구분자를 찾는다
- [ ] 숫자를 더한다.
