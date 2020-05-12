package com.mtl.cypw.domain.member.param;

import lombok.Data;

/**
 * @author tang.
 * @date 2020/3/3.
 */
@Data
public class MemberSignInParam {
    /**
     * 用户id
     */
    private Integer memberId;
    /**
     * 订单id
     */
    private Integer orderId;
    /**
     * 项目id
     */
    private Integer programId;
    /**
     * 场次id
     */
    private Integer eventId;
    /**
     * 剧院id
     */
    private Integer theatreId;
    /**
     * 签到地址
     */
    private String signInAddress;
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 签到类型
     * 1：正常签到，2：迟到签到，3：异地签到，4：异地迟到签到
     */
    private Integer type;
    /**
     * 商户id
     */
    private Integer enterpriseId;
    /**
     * 备注
     */
    private String remark;

    public Boolean checkParam() {
        if (this.memberId == null || this.programId == null || this.eventId == null ||
                this.theatreId == null || this.enterpriseId == null) {
            return false;
        }
        return true;
    }
}
