package org.ged.dao;

import org.ged.entities.AppRole;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {AppRoleRepository.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"org.ged.entities"})
@DataJpaTest
class AppRoleRepositoryTest {
    @Autowired
    private AppRoleRepository appRoleRepository;

    /**
     * Method under test: {@link AppRoleRepository#findByRoleEquals(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByRoleEquals() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent findByRoleEquals(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findByRoleEquals(String).
        //   See https://diff.blue/R013 to resolve this issue.

        AppRoleRepository appRoleRepository = null;
        appRoleRepository.findByRoleEquals("foo");
    }

    /**
     * Method under test: {@link AppRoleRepository#findByRoleEquals(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByRoleEquals2() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: posteEmployeRepository defined in org.ged.dao.PosteEmployeRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:132)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'posteEmployeRepository' defined in org.ged.dao.PosteEmployeRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Invocation of init method failed; nested exception is org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! Reason: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.; nested exception is java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! Reason: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.; nested exception is java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.data.repository.query.QueryCreationException.create(QueryCreationException.java:101)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:106)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$mapMethodsToQuery$1(QueryExecutorMethodInterceptor.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.Iterator.forEachRemaining(Iterator.java:116)
        //       at java.util.Collections$UnmodifiableCollection$1.forEachRemaining(Collections.java:1051)
        //       at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:96)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:86)
        //       at java.util.Optional.map(Optional.java:215)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:86)
        //       at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:364)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$5(RepositoryFactoryBeanSupport.java:322)
        //       at org.springframework.data.util.Lazy.getNullable(Lazy.java:230)
        //       at org.springframework.data.util.Lazy.get(Lazy.java:114)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:328)
        //       at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:144)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.lambda$invokeInitMethods$5(AbstractAutowireCapableBeanFactory.java:1854)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1853)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.<init>(PartTreeJpaQuery.java:96)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:113)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateIfNotFoundQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:254)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$AbstractQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:87)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:102)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$mapMethodsToQuery$1(QueryExecutorMethodInterceptor.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.Iterator.forEachRemaining(Iterator.java:116)
        //       at java.util.Collections$UnmodifiableCollection$1.forEachRemaining(Collections.java:1051)
        //       at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:96)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:86)
        //       at java.util.Optional.map(Optional.java:215)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:86)
        //       at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:364)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$5(RepositoryFactoryBeanSupport.java:322)
        //       at org.springframework.data.util.Lazy.getNullable(Lazy.java:230)
        //       at org.springframework.data.util.Lazy.get(Lazy.java:114)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:328)
        //       at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:144)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.lambda$invokeInitMethods$5(AbstractAutowireCapableBeanFactory.java:1854)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1853)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   org.springframework.data.mapping.PropertyReferenceException: No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.data.mapping.PropertyPath.<init>(PropertyPath.java:90)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:437)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:413)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:447)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:470)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:413)
        //       at org.springframework.data.mapping.PropertyPath.lambda$from$0(PropertyPath.java:366)
        //       at java.util.concurrent.ConcurrentMap.computeIfAbsent(ConcurrentMap.java:324)
        //       at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:348)
        //       at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:331)
        //       at org.springframework.data.repository.query.parser.Part.<init>(Part.java:81)
        //       at org.springframework.data.repository.query.parser.PartTree$OrPart.lambda$new$0(PartTree.java:249)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.query.parser.PartTree$OrPart.<init>(PartTree.java:250)
        //       at org.springframework.data.repository.query.parser.PartTree$Predicate.lambda$new$0(PartTree.java:383)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.query.parser.PartTree$Predicate.<init>(PartTree.java:384)
        //       at org.springframework.data.repository.query.parser.PartTree.<init>(PartTree.java:95)
        //       at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.<init>(PartTreeJpaQuery.java:89)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:113)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateIfNotFoundQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:254)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$AbstractQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:87)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:102)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$mapMethodsToQuery$1(QueryExecutorMethodInterceptor.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.Iterator.forEachRemaining(Iterator.java:116)
        //       at java.util.Collections$UnmodifiableCollection$1.forEachRemaining(Collections.java:1051)
        //       at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:96)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:86)
        //       at java.util.Optional.map(Optional.java:215)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:86)
        //       at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:364)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$5(RepositoryFactoryBeanSupport.java:322)
        //       at org.springframework.data.util.Lazy.getNullable(Lazy.java:230)
        //       at org.springframework.data.util.Lazy.get(Lazy.java:114)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:328)
        //       at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:144)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.lambda$invokeInitMethods$5(AbstractAutowireCapableBeanFactory.java:1854)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1853)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   See https://diff.blue/R026 to resolve this issue.

        AppRole appRole = new AppRole();
        appRole.setCreate(true);
        appRole.setDelete(true);
        appRole.setRead(true);
        appRole.setRole("Role");
        appRole.setUpdate(true);
        this.appRoleRepository.save(appRole);

        AppRole appRole1 = new AppRole();
        appRole1.setCreate(true);
        appRole1.setDelete(true);
        appRole1.setRead(true);
        appRole1.setRole("Role");
        appRole1.setUpdate(true);
        this.appRoleRepository.save(appRole1);
        this.appRoleRepository.findByRoleEquals("foo");
    }

    /**
     * Method under test: {@link AppRoleRepository#findByRoleContaining(String, org.springframework.data.domain.Pageable)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByRoleContaining() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent findByRoleContaining(String, Pageable)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findByRoleContaining(String, Pageable).
        //   See https://diff.blue/R013 to resolve this issue.

        AppRoleRepository appRoleRepository = null;
        appRoleRepository.findByRoleContaining("foo", null);
    }

    /**
     * Method under test: {@link AppRoleRepository#findByRoleContaining(String, Pageable)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByRoleContaining2() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: posteEmployeRepository defined in org.ged.dao.PosteEmployeRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:132)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'posteEmployeRepository' defined in org.ged.dao.PosteEmployeRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Invocation of init method failed; nested exception is org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! Reason: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.; nested exception is java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! Reason: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.; nested exception is java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.data.repository.query.QueryCreationException.create(QueryCreationException.java:101)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:106)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$mapMethodsToQuery$1(QueryExecutorMethodInterceptor.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.Iterator.forEachRemaining(Iterator.java:116)
        //       at java.util.Collections$UnmodifiableCollection$1.forEachRemaining(Collections.java:1051)
        //       at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:96)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:86)
        //       at java.util.Optional.map(Optional.java:215)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:86)
        //       at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:364)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$5(RepositoryFactoryBeanSupport.java:322)
        //       at org.springframework.data.util.Lazy.getNullable(Lazy.java:230)
        //       at org.springframework.data.util.Lazy.get(Lazy.java:114)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:328)
        //       at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:144)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.lambda$invokeInitMethods$5(AbstractAutowireCapableBeanFactory.java:1854)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1853)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List org.ged.dao.PosteEmployeRepository.findByEmployeOrEmployeNameContaining(java.lang.String)! No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.<init>(PartTreeJpaQuery.java:96)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:113)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateIfNotFoundQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:254)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$AbstractQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:87)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:102)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$mapMethodsToQuery$1(QueryExecutorMethodInterceptor.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.Iterator.forEachRemaining(Iterator.java:116)
        //       at java.util.Collections$UnmodifiableCollection$1.forEachRemaining(Collections.java:1051)
        //       at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:96)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:86)
        //       at java.util.Optional.map(Optional.java:215)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:86)
        //       at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:364)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$5(RepositoryFactoryBeanSupport.java:322)
        //       at org.springframework.data.util.Lazy.getNullable(Lazy.java:230)
        //       at org.springframework.data.util.Lazy.get(Lazy.java:114)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:328)
        //       at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:144)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.lambda$invokeInitMethods$5(AbstractAutowireCapableBeanFactory.java:1854)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1853)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   org.springframework.data.mapping.PropertyReferenceException: No property 'name' found for type 'Employe'! Traversed path: PosteEmploye.employe.
        //       at org.springframework.data.mapping.PropertyPath.<init>(PropertyPath.java:90)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:437)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:413)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:447)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:470)
        //       at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:413)
        //       at org.springframework.data.mapping.PropertyPath.lambda$from$0(PropertyPath.java:366)
        //       at java.util.concurrent.ConcurrentMap.computeIfAbsent(ConcurrentMap.java:324)
        //       at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:348)
        //       at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:331)
        //       at org.springframework.data.repository.query.parser.Part.<init>(Part.java:81)
        //       at org.springframework.data.repository.query.parser.PartTree$OrPart.lambda$new$0(PartTree.java:249)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.query.parser.PartTree$OrPart.<init>(PartTree.java:250)
        //       at org.springframework.data.repository.query.parser.PartTree$Predicate.lambda$new$0(PartTree.java:383)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.query.parser.PartTree$Predicate.<init>(PartTree.java:384)
        //       at org.springframework.data.repository.query.parser.PartTree.<init>(PartTree.java:95)
        //       at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.<init>(PartTreeJpaQuery.java:89)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:113)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateIfNotFoundQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:254)
        //       at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$AbstractQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:87)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:102)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$mapMethodsToQuery$1(QueryExecutorMethodInterceptor.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
        //       at java.util.Iterator.forEachRemaining(Iterator.java:116)
        //       at java.util.Collections$UnmodifiableCollection$1.forEachRemaining(Collections.java:1051)
        //       at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:96)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:86)
        //       at java.util.Optional.map(Optional.java:215)
        //       at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:86)
        //       at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:364)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$5(RepositoryFactoryBeanSupport.java:322)
        //       at org.springframework.data.util.Lazy.getNullable(Lazy.java:230)
        //       at org.springframework.data.util.Lazy.get(Lazy.java:114)
        //       at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:328)
        //       at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:144)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.lambda$invokeInitMethods$5(AbstractAutowireCapableBeanFactory.java:1854)
        //       at java.security.AccessController.doPrivileged(Native Method)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1853)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
        //       at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        //       at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        //       at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        //       at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:934)
        //       at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        //       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        //       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740)
        //       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415)
        //       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
        //       at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:144)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124)
        //   See https://diff.blue/R026 to resolve this issue.

        AppRole appRole = new AppRole();
        appRole.setCreate(true);
        appRole.setDelete(true);
        appRole.setRead(true);
        appRole.setRole("Role");
        appRole.setUpdate(true);
        this.appRoleRepository.save(appRole);

        AppRole appRole1 = new AppRole();
        appRole1.setCreate(true);
        appRole1.setDelete(true);
        appRole1.setRead(true);
        appRole1.setRole("Role");
        appRole1.setUpdate(true);
        this.appRoleRepository.save(appRole1);
        this.appRoleRepository.findByRoleContaining("foo", Pageable.unpaged());
    }
}

