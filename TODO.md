### 리팩터링 및 고민해볼 것

- [ ] 회의를 통해 변화한 요구사항의 API로 변경
- [ ] 각각 쿼리 보내고, 결과물을 `Repository`에서 합치기 vs 테이블을 join해서 쿼리 보내기
- [ ] Exception Response 만들어서 반환
- [ ] Controller, Service, Repository 계층에 대한 MockMvc 테스트코드 작성
- [ ] Unhappy case에 대한 인수 테스트 작성 (실패하는 것부터 먼저 작성하는게 호흡이 짧아 좋다.)
- [ ] `http-request.http`에서 Authentication header를 보내도록 작성
- [ ] Order 인수 테스트 작성