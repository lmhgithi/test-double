package Mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTestMockito {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    @Mock
    private DoorPanel doorPanel;
    @InjectMocks
    private SecurityCenter securityCenter;
    @BeforeEach
    public void setUp() {
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel).close();
    }
}
