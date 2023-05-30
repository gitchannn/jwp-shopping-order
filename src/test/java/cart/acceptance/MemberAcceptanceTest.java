package cart.acceptance;

import cart.application.MemberService;
import cart.dao.MemberDao;
import cart.domain.Member;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static cart.fixture.MemberFixtures.MEMBER_GITCHAN;
import static cart.steps.PointSteps.멤버의_포인트_조회_요청;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.http.HttpStatus.OK;

public class MemberAcceptanceTest extends AcceptanceTest {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private MemberService memberService;

    @Test
    void 멤버의_포인트를_조회할_수_있다() {
        memberService.addMember(MEMBER_GITCHAN);
        final Member gitchan = memberDao.getMemberByEmail(MEMBER_GITCHAN.getEmail());

        final ExtractableResponse<Response> response = 멤버의_포인트_조회_요청(gitchan);

        assertThat(response.statusCode()).isEqualTo(OK.value());
        assertThat(response.jsonPath().getInt("points")).isGreaterThanOrEqualTo(0);
    }
}