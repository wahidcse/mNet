package org.jugbd.mnet.dao;

import org.jugbd.mnet.domain.ComplicationManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bazlur Rahman Rokon
 * @date 12/26/14.
 */
@Repository
public interface ComplicationManagementDao extends JpaRepository<ComplicationManagement, Long> {
}
