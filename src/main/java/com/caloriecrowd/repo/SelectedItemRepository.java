package com.caloriecrowd.repo;

import com.caloriecrowd.entity.SelectedItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.UUID;

public interface SelectedItemRepository extends JpaRepository<SelectedItemEntity, UUID> {

  @Query("SELECT totalCalorie FROM SelectedItems s Where s.date=:date AND s.userId=:userId")
  public List<Integer> fatchCalorieOnDate(
      @Param("date") String date, @Param("userId") String userId);

  @Query("SELECT totalProtein FROM SelectedItems s Where s.date=:date AND s.userId=:userId")
  public List<Integer> fatchProteinOnDate(
      @Param("date") String date, @Param("userId") String userId);

  @Query("SELECT totalCarb FROM SelectedItems s Where s.date=:date AND s.userId=:userId")
  public List<Integer> fatchCarbOnDate(@Param("date") String date, @Param("userId") String userId);
}
