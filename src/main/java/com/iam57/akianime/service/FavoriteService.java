package com.iam57.akianime.service;

import com.iam57.akianime.common.result.PageResult;
import com.iam57.akianime.dto.FavoriteDTO;
import com.iam57.akianime.dto.FavoriteUpdateDTO;
import com.iam57.akianime.vo.FavoriteVO;
import com.iam57.akianime.vo.UserFavoriteInfoVO;

import java.util.List;

/**
 * @author iam57
 * @since 2024/6/30 15:38
 */
public interface FavoriteService {
    PageResult<UserFavoriteInfoVO> getByUserId(Integer userId, Integer pageNum, Integer pageSize);

    FavoriteVO insertByUserId(Integer userId, FavoriteDTO favoriteDTO);

    Integer deleteByUserIdAndAnimationIds(Integer userId, List<Integer> animationIds);

    FavoriteVO updateByUserIdAndAnimationId(Integer userId, Integer animationId, FavoriteUpdateDTO favoriteUpdateDTO);
}
